package az.unibank.unitechmsauth.model.response;

import lombok.Data;

@Data
public class UserResponseDto {
    private Long id;
    private String customerPin;
    private String name;
    private String surname;
    private String email;
}
