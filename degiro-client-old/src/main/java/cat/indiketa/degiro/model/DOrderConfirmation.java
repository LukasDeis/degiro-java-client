package cat.indiketa.degiro.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DOrderConfirmation {
    public String confirmationId;
    public double freeSpaceNew;
    public String message;
    public long status;
    public String statusText;
}
