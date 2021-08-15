package cat.indiketa.degiro.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DOrders {

    private List<DOrder> orders;

}
