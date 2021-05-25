
package kodlamaio.hrms.service.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.dto.EmployerDto;
import kodlamaio.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {

    Result add(EmployerDto employerDto);
    Result getAll();
    void delete(Employer employer);
    void update(Employer employer);

}