package cat.indiketa.degiro.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DLogin {

    private String username;
    private String password;
    private boolean isRedirectToMobile;
    private String loginButtonUniversal;

    public DLogin(String username,
                  String password,
                  boolean isRedirectToMobile,
                  String loginButtonUniversal){
        this.username = username;
        this.password = password;
        this.isRedirectToMobile = isRedirectToMobile;
        this.loginButtonUniversal = loginButtonUniversal;
    }

    public DLogin(String username,
                  String password){
        this.username = username;
        this.password = password;
        this.isRedirectToMobile = false;
        this.loginButtonUniversal = null;
    }
}
