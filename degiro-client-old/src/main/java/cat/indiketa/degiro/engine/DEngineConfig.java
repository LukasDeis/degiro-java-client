package cat.indiketa.degiro.engine;

import java.io.File;

/**
 *
 * @author indiketa
 */
public class DEngineConfig {

    public File getDataDirectory() {
        return new File("C:/Users/Lukas/Desktop/degiro-java-client/test");
    }

    public int getProductPriceHistoryCount() {
        // 10h at 5sec
        return 10 * 60 * 60 / 5;
    }

    public int getProductPriceHistoryMinInterval() {
        return 5;
    }

    public int getPortfolioRefreshInterval() {
        return 5;
    }

}
