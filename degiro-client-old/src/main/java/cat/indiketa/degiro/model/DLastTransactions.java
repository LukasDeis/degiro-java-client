package src.main.java.cat.indiketa.degiro.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
public class DLastTransactions {

    private List<DTransaction> transactions;

    @Data
    @Builder
    @NoArgsConstructor
    public static class DTransaction {

        private long id;
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

}
