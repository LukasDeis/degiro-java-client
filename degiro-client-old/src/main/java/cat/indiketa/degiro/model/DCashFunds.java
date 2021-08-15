package cat.indiketa.degiro.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
public class DCashFunds {

    private List<DCashFund> cashFunds;

    @Data
    @Builder
    @NoArgsConstructor
    public static class DCashFund {
        private int id;
        private String currencyCode;
        private BigDecimal value;
    }
}
