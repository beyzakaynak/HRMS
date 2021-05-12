
package kodlamaio.hrms.service.abstracts;

import kodlamaio.hrms.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {
    List<JobPosition> getAll();
    JobPosition add(JobPosition jobPosition);
}