package cat.indiketa.degiro.engine;

import cat.indiketa.degiro.DeGiro;
import cat.indiketa.degiro.DeGiroFactory;
import cat.indiketa.degiro.model.DOrder;
import cat.indiketa.degiro.utils.DCredentials;

import java.io.File;
import java.util.List;

/**
 *
 * @author indiketa
 */
public class Main {

    public static void main(String[] args) throws Exception {
        //log in
        DCredentials credentials = getCredentials();
        DeGiro degiro = DeGiroFactory.newInstance(credentials);

        //test connection by printing all open product orders
        List<DOrder> orders = degiro.getOrders();
        for (DOrder order : orders){
            System.out.println(order.getProduct());
        }

        //starting the automatic bailout bot
    }

    private static DCredentials getCredentials() {
        DCredentials creds = new DCredentials() {

            @Override
            public String getUsername() {
                return "";
            }

            @Override
            public String getPassword() {
                return "";
            }
        };
        return creds;
    }
}

