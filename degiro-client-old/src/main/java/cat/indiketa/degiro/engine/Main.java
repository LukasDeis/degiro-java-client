package cat.indiketa.degiro.engine;

import cat.indiketa.degiro.DeGiro;
import cat.indiketa.degiro.DeGiroFactory;
import cat.indiketa.degiro.DeGiroImpl;
import cat.indiketa.degiro.engine.automation.BailoutBot;
import cat.indiketa.degiro.model.DOrder;
import cat.indiketa.degiro.utils.DCredentials;

import java.io.File;
import java.util.List;
import java.util.Scanner;

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
        BailoutBot bot = new BailoutBot(degiro);
    }

    private static DCredentials getCredentials() {
        DCredentials creds = new DCredentials() {
            private Scanner scan = new Scanner(System.in);

            @Override
            public String getUsername() {
                System.out.println("Please enter your username.");
                String username = scan.nextLine();
                return username;
            }

            @Override
            public String getPassword() {
                System.out.println("Please enter your password.");
                String pw = scan.nextLine();
                return pw;
            }
        };
        return creds;
    }
}

