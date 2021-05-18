package kodlamaio.hrms.dto;

import lombok.Data;

@Data
public class JobSeekerDto {

    private String firstName;
    private String lastName;
    private Long nationalId;
    private Integer yearOfBirth;
    private String email;
    private String password;

}