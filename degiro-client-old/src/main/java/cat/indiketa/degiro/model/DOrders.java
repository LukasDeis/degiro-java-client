package cat.indiketa.degiro.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
public class DOrders {

    private List<DOrder> orders;

}
