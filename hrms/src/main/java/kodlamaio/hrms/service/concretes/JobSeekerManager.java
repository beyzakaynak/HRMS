package kodlamaio.hrms.service.concretes;

import kodlamaio.hrms.core.mernisAdapter.abstracts.MernisAdapterService;
import kodlamaio.hrms.dto.JobSeekerDto;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.concretes.User;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class JobSeekerManager {

    @Autowired
    private MernisAdapterService mernisAdapterService;


    @Autowired
    private UserDao userDao;
    @Autowired
    private JobSeekerDao jobSeekerDao;

    public void jobSeekerAdd(JobSeekerDto jobSeekerDto) throws Exception {

        Boolean isTrue = mernisAdapterService.verifyNationalityId(jobSeekerDto);
        if (isTrue) {
            if (Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE).matcher(jobSeekerDto.getEmail()).matches()) {
                User user = new User();
                user.setEmail(jobSeekerDto.getEmail());
                user.setPassword(jobSeekerDto.getPassword());


                User inDb = userDao.save(user);

                JobSeeker jobSeeker = new JobSeeker();
                jobSeeker.setFirsName(jobSeekerDto.getFirstName());
                jobSeeker.setLastName(jobSeekerDto.getLastName());
                jobSeeker.setNationalId(jobSeekerDto.getNationalId());
                jobSeeker.setYearOfBirth(jobSeekerDto.getYearOfBirth());
                jobSeeker.setUser(inDb);

                jobSeekerDao.save(jobSeeker);
            } else {
                throw new Exception("Emailiniz hatalıdır.");
            }

        } else {
            throw new Exception("Bilgileriniz hatalıdır.");
        }


    }


}
