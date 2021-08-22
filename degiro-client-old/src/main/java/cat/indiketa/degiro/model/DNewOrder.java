package cat.indiketa.degiro.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
public class DNewOrder {
    private DOrderAction action;
    private DOrderType orderType;
    private DOrderTime timeType;
    private long productId;
    private long size;
    private BigDecimal limitPrice;
    private BigDecimal stopPrice;

    public DNewOrder(DOrderAction action, DOrderType orderType, DOrderTime timeType, long productId, long size, BigDecimal limitPrice, BigDecimal stopPrice) {
        this.action = action;
        this.orderType = orderType;
        this.timeType = timeType;
        this.productId = productId;
        this.size = size;
        this.limitPrice = limitPrice;
        this.stopPrice = stopPrice;
    }
}
