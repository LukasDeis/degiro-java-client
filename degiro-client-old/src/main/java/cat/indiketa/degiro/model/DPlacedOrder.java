package src.main.java.cat.indiketa.degiro.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class DPlacedOrder {

    private int status;
    private String statusText;
    private String orderId;
}
