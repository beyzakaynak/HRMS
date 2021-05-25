
package kodlamaio.hrms.service.concretes;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.dto.EmployerDto;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.User;
import kodlamaio.hrms.service.abstracts.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.regex.Pattern;

@Service
@Transactional
public class EmployerManager implements EmployerService {


    private UserDao userDao;
    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(UserDao userDao, EmployerDao employerDao) {
        this.userDao = userDao;
        this.employerDao = employerDao;
    }

    @Override
    public Result add(EmployerDto employerDto) {
        if (employerDto.getEmail().contains(employerDto.getWebsite())) {
            User user = new User();
            user.setEmail(employerDto.getEmail());
            user.setPassword(employerDto.getPassword());


            User inDb = userDao.save(user);

            Employer employer = new Employer();
            employer.setCompanyName(employerDto.getCompanyName());
            employer.setPhoneNumber(employerDto.getPhoneNumber());
            employer.setWebsite(employerDto.getWebsite());
            employerDao.save(employer);
            return new SuccessResult("Kayıt başarılı!");
        } else {
            return new ErrorResult("E-mail ve şirket ismi uyuşmuyor. Lütfen şirket mailinizi giriniz");
        }


    }

    @Override
    public Result getAll() {

        return new DataResult<List<Employer>>(employerDao.findAll(),true);
    }

    @Override
    public void delete(Employer employer) {

    }

    @Override
    public void update(Employer employer) {

    }
}