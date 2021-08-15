package cat.indiketa.degiro.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class DLogin {

    private String username;
    private String password;
    private boolean isRedirectToMobile;
    private String loginButtonUniversal;
}
