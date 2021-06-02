package kodlamaio.hrms.dto;

import kodlamaio.hrms.entities.concretes.JobExperience;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JobExperienceDto {

    private String workplaceName;
    private String position;
    private String beginningYear;
    private String endingYear;

    public JobExperienceDto(JobExperience jobExperience) {
        this.workplaceName = jobExperience.getWorkplaceName();
        this.position = jobExperience.getPosition();
        this.beginningYear = jobExperience.getBeginningYear();
        this.endingYear = jobExperience.getEndingYear();
    }
}
