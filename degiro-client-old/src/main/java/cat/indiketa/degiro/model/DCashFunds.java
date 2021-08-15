package cat.indiketa.degiro.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

@Data
@Builder
public class DCashFunds {

    private List<DCashFund> cashFunds;

    public DCashFunds(){
        cashFunds = new LinkedList<>();
    }

    public DCashFunds(List<DCashFund> cashFunds){
        this.cashFunds = cashFunds;
    }

    @Data
    @Builder
    public static class DCashFund {
        private int id;
        private String currencyCode;
        private BigDecimal value;

        public DCashFund(){
        }

        public DCashFund(
                int id,
                String currencyCode,
                BigDecimal value
        ){
            this.id = id;
            this.currencyCode = currencyCode;
            this.value = value;
        }
    }
}
