package src.main.java.cat.indiketa.degiro;

import src.main.java.cat.indiketa.degiro.exceptions.DeGiroException;
import src.main.java.cat.indiketa.degiro.model.DCashFunds;
import src.main.java.cat.indiketa.degiro.model.DLastTransactions;
import src.main.java.cat.indiketa.degiro.model.DNewOrder;
import src.main.java.cat.indiketa.degiro.model.DOrder;
import src.main.java.cat.indiketa.degiro.model.DOrderConfirmation;
import src.main.java.cat.indiketa.degiro.model.DPlacedOrder;
import src.main.java.cat.indiketa.degiro.model.DPortfolioProducts;
import src.main.java.cat.indiketa.degiro.model.DPortfolioSummary;
import src.main.java.cat.indiketa.degiro.model.DPriceHistory;
import src.main.java.cat.indiketa.degiro.model.DPriceListener;
import src.main.java.cat.indiketa.degiro.model.DProductSearch;
import src.main.java.cat.indiketa.degiro.model.DProductType;
import src.main.java.cat.indiketa.degiro.model.DProductDescriptions;
import src.main.java.cat.indiketa.degiro.model.DTransactions;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author indiketa
 */
public interface DeGiro {

    DCashFunds getCashFunds() throws DeGiroException;

    DLastTransactions getLastTransactions() throws DeGiroException;

    List<DOrder> getOrders() throws DeGiroException;

    DPortfolioProducts getPortfolio() throws DeGiroException;

    DPortfolioSummary getPortfolioSummary() throws DeGiroException;

    DTransactions getTransactions(Calendar from, Calendar to) throws DeGiroException;

    void setPriceListener(DPriceListener priceListener);

    void setPricePollingInterval(int duration, TimeUnit unit) throws DeGiroException;

    void unsubscribeToPrice(String vwdIssueId) ;
    
    void subscribeToPrice(String vwdIssueId) throws DeGiroException;

    void subscribeToPrice(Collection<String> vwdIssueId) throws DeGiroException;

    void clearPriceSubscriptions();

    DProductSearch searchProducts(String text, DProductType type, int limit, int offset) throws DeGiroException;

    DProductDescriptions getProducts(List<Long> productIds) throws DeGiroException;

    DOrderConfirmation checkOrder(DNewOrder order) throws DeGiroException;

    DPlacedOrder confirmOrder(DNewOrder order, String confirmationId) throws DeGiroException;

    DPlacedOrder deleteOrder(String orderId) throws DeGiroException;

    DPlacedOrder updateOrder(DOrder order, BigDecimal limit, BigDecimal stop) throws DeGiroException;

    DPriceHistory getPriceHistory(Long issueId) throws DeGiroException;

}
