package kodlamaio.hrms.dto;

import lombok.Data;

@Data
public class EmployerDto {
    private Long phoneNumber;
    private String website;
    private String companyName;
    private String email;
    private String password;
}
