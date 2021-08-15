package cat.indiketa.degiro.model;

import lombok.Builder;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
@Builder
public class DOrders {

    private List<DOrder> orders;

    public DOrders(){
        orders = new LinkedList<>();
    }

    public DOrders(List<DOrder> orders){
        this.orders = orders;
    }

}
