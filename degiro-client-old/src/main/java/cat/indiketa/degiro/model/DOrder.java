/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.indiketa.degiro.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Calendar;

@Data
@Builder
public class DOrder {
    private String id;
    private Calendar date;
    private long productId;
    private String product;
    private int contractType;
    private int contractSize;
    private String currency;
    private DOrderAction buysell;
    private long size;
    private long quantity;
    private BigDecimal price;
    private BigDecimal stopPrice;
    private BigDecimal totalOrderValue;
    private DOrderType orderType;
    private DOrderTime orderTime;
    private boolean isModifiable;
    private boolean isDeletable;

    public DOrder(){
    }

    public DOrder(
            String id,
            Calendar date,
            long productId,
            String product,
            int contractType,
            int contractSize,
            String currency,
            DOrderAction buysell,
            long size,
            long quantity,
            BigDecimal price,
            BigDecimal stopPrice,
            BigDecimal totalOrderValue,
            DOrderType orderType,
            DOrderTime orderTime,
            boolean isModifiable,
            boolean isDeletable
    ){
        this.id = id;
        this.date = date;
        this.productId = productId;
        this.product = product;
        this.contractType = contractType;
        this.contractSize = contractSize;
        this.currency = currency;
        this.buysell = buysell;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
        this.stopPrice = stopPrice;
        this.totalOrderValue = totalOrderValue;
        this.orderType = orderType;
        this.orderTime = orderTime;
        this.isModifiable = isModifiable;
        this.isDeletable = isDeletable;
    }
}
