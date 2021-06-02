package kodlamaio.hrms.entities.concretes;


import kodlamaio.hrms.dto.JobExperienceDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_experiences")
public class JobExperience {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "workplace_name")
    private String workplaceName;

    @Column(name = "position")
    private String position;

    @Column(name = "beginning_year")
    private String beginningYear;

    @Column(name = "ending_year")
    private String endingYear;

    @ManyToOne
    private Candidate candidate;

    public JobExperience(JobExperienceDto jobExperienceDto) {
        this.workplaceName = jobExperienceDto.getWorkplaceName();
        this.position = jobExperienceDto.getPosition();
        this.beginningYear = jobExperienceDto.getBeginningYear();
        this.endingYear = jobExperienceDto.getEndingYear();
    }
}
