package cat.indiketa.degiro.engine;

import java.io.File;

/**
 *
 * @author indiketa
 */
public class Main {

    public static void main(String[] args) throws Exception {
        // Credentials credentials = new Credentials(new File("/home/ecatala/dg.properties"));
        Credentials credentials = new Credentials("testname", "testPW");
        DEngine e = new DEngine(credentials);

        e.startEngine();
    }
}

