
package kodlamaio.hrms.service.abstracts;

import kodlamaio.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {

    void add(Employer employer);
    List<Employer> getAll();
    void delete(Employer employer);
    void update(Employer employer);

}