package kodlamaio.hrms.dto;

import kodlamaio.hrms.entities.concretes.JobPosition;
import lombok.Data;

@Data
public class JobPositionDto {

    private String name;

    public JobPositionDto(JobPosition jobPosition) {
        this.name = jobPosition.getName();
    }
}
