package cat.indiketa.degiro.engine.automation

import cat.indiketa.degiro.DeGiroImpl
import cat.indiketa.degiro.model.*
import com.google.common.base.Strings
import java.math.BigDecimal


class BailoutBot (
        degiro: DeGiroImpl
        ){

    private var degiro: DeGiroImpl

    init {
        this.degiro = degiro
        // Register a price update listener (called on price update) for every product
        val products = degiro.portfolio.active

        // Create a vwdIssueId list. Note that vwdIssueId is NOT a productId (vwdIssueId is a DProduct field).
        val vwdIssueIds: MutableList<Long> = ArrayList(products.size)

        for (product in products){
            degiro.setPriceListener(DPriceListener {
                actOnPrice(product)
            })
            val vwdID = product
            vwdIssueIds.add(vwdID) // Example product vwdIssueId
        }
        degiro.subscribeToPrice(vwdIssueIds) // Callable multiple times with different products.
    }

    private fun actOnPrice(product: DPortfolioProducts.DPortfolioProduct) {
        val price = product.price
        val lastClose = product.closePrice
        val absoluteChange =  price - lastClose
        if (absoluteChange < BigDecimal.ZERO){ //if the product lost value today
            val percentualChange = absoluteChange.abs() / price
            if (percentualChange > BigDecimal(0.03)){
                //TODO email to myself
            }
            if(percentualChange > BigDecimal(0.05)){
                // Generate a new order. Signature:
                // public DNewOrder(DOrderAction action, DOrderType orderType, DOrderTime timeType, long productId, long size, BigDecimal limitPrice, BigDecimal stopPrice)
                val productID = product.id
                val size = degiro.portfolio.active
                    .filter { it.id = productID }
                    .size
                    .toLong()
                val order = DNewOrder(
                    DOrderAction.SELL,
                    DOrderType.LIMITED,
                    DOrderTime.DAY,
                    productID,
                    size,
                    BigDecimal("4.5"),
                    null)
                val confirmation: DOrderConfirmation = degiro.checkOrder(order)

                if (!Strings.isNullOrEmpty(confirmation.confirmationId)) {
                    val placed: DPlacedOrder = degiro.confirmOrder(order, confirmation.confirmationId)
                    if (placed.status != 0) {
                        throw RuntimeException("Order not placed: " + placed.statusText)
                    }
                }
            }
        }
    }
}
