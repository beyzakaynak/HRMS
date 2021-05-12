
package kodlamaio.hrms.service.concretes;

import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.service.abstracts.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployerManager implements EmployerService {


    private UserDao userDao;
    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(UserDao userDao, EmployerDao employerDao) {
        this.userDao = userDao;
        this.employerDao = employerDao;
    }

    @Override
    public void add(Employer employer) {

        employerDao.save(employer);
    }

    @Override
    public List<Employer> getAll() {

        return employerDao.findAll();
    }

    @Override
    public void delete(Employer employer) {

    }

    @Override
    public void update(Employer employer) {

    }
}