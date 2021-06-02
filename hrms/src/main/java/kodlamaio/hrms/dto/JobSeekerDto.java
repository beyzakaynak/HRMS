package kodlamaio.hrms.dto;

import kodlamaio.hrms.entities.concretes.JobSeeker;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JobSeekerDto {

    private String firstName;
    private String lastName;
    private Long nationalId;
    private Integer yearOfBirth;
    private String email;
    private String password;

    public JobSeekerDto(JobSeeker jobSeeker) {
        this.firstName = jobSeeker.getFirsName();
        this.lastName = jobSeeker.getLastName();
        this.nationalId = jobSeeker.getNationalId();
        this.yearOfBirth = jobSeeker.getYearOfBirth();
        this.email = jobSeeker.getUser().getEmail();
        this.password = jobSeeker.getUser().getPassword();
    }
}