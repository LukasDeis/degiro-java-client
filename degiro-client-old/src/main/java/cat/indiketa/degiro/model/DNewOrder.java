package src.main.java.cat.indiketa.degiro.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DNewOrder {
    private DOrderAction action;
    private DOrderType orderType;
    private DOrderTime timeType;
    private long productId;
    private long size;
    private BigDecimal limitPrice;
    private BigDecimal stopPrice;
}
