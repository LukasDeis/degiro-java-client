package src.main.java.cat.indiketa.degiro.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class DClient {
    private long id;
    private long intAccount;
    private String clientRole;
    private String username;
    private String displayName;
    private String email;
    private FirstContact firstContact;
    private Address address;
    private String phoneNumber;
    private String cellphoneNumber;
    private String locale;
    private String language;
    private String culture;
    private BankAccount bankAccount;
    private String memberCode;
    private boolean isAllocationAvailable;
    private boolean isIskClient;
    private boolean isWithdrawalAvailable;
    private boolean isCollectivePortfolio;
    private boolean isAmClientActive;


    @Data
    @Builder
    @NoArgsConstructor
    public static class Address {
        public String streetAddress;
        public String streetAddressNumber;
        public String streetAddressExt;
        public String zip;
        public String city;
        public String country;
        public String postalCode;
    }

    @Data
    @Builder
    @NoArgsConstructor
    public static class BankAccount {

        public String iban;
        public String bic;
        public String name;
        public String number;
        public String sortCode;
    }

    @Data
    @Builder
    @NoArgsConstructor
    public static class FirstContact {

        public String firstName;
        public String lastName;
        public String nationality;
        public String sofiNumber;
        public String gender;
        public String birthday;
        public String placeOfBirth;
        public String countryOfBirth;
    }
}
