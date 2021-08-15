/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.cat.indiketa.degiro.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Calendar;

@Data
@Builder
@NoArgsConstructor
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
}
