package cat.indiketa.degiro.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DPlacedOrder {

    private int status;
    private String statusText;
    private String orderId;
}
