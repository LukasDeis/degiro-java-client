package cat.indiketa.degiro.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

@Data
@Builder
public class DLastTransactions {

    private List<DTransaction> transactions;

    public DLastTransactions(List<DTransaction> transactions){
        this.transactions = transactions;
    }


    @Data
    @Builder
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

        public DTransaction(){

        }

        public DTransaction(
                long id,
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
}
