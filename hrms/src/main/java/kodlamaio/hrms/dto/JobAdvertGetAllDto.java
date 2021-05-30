package kodlamaio.hrms.dto;

import kodlamaio.hrms.core.utilities.enums.Cities;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.JobAdvert;
import kodlamaio.hrms.entities.concretes.JobPosition;
import lombok.Data;

import java.util.Date;

@Data
public class JobAdvertGetAllDto {

    private int id;
    private String jobDescription;
    private Long maxSalary;
    private Long minSalary;
    private Integer openPositions;
    private Date deadline;
    private Date releaseDate;
    private Cities city;
    private String jobPositionName;
    private String companyName;

    public JobAdvertGetAllDto(JobAdvert jobAdvert) {
        this.id = jobAdvert.getId();
        this.jobDescription = jobAdvert.getJobDescription();
        this.maxSalary = jobAdvert.getMaxSalary();
        this.minSalary = jobAdvert.getMinSalary();
        this.openPositions = jobAdvert.getOpenPositions();
        this.deadline = jobAdvert.getDeadline();
        this.releaseDate = jobAdvert.getReleaseDate();
        this.city = jobAdvert.getCity();
        this.jobPositionName = jobAdvert.getJobPosition().getName();
        this.companyName = jobAdvert.getEmployer().getCompanyName();
    }

}
