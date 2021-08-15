package src.main.java.cat.indiketa.degiro;

import src.main.java.cat.indiketa.degiro.session.DSession;
import src.main.java.cat.indiketa.degiro.session.DSessionExpiredRetryProxy;
import src.main.java.cat.indiketa.degiro.utils.DCredentials;


public class DeGiroFactory {

    public static DeGiro newInstance(DCredentials credentials) {
        return newInstance(credentials, new DSession());
    }

    public static DeGiro newInstance(DCredentials credentials, DSession session) {
        DeGiroImpl dmanager = new DeGiroImpl(credentials, session);
        return DSessionExpiredRetryProxy.newInstance(dmanager);
    }

}
