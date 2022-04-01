package az.unibank.unitechmsauth.model;

import lombok.Data;

@Data
public class UserCreateDto {

    private String customerPin;
    private String name;
    private String surname;
    private String email;
    private String password;
}
