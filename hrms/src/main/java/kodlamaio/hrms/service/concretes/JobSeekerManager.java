package kodlamaio.hrms.service.concretes;
import kodlamaio.hrms.dto.JobSeekerDto;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.concretes.User;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobSeekerManager {
    @Autowired
    private UserDao userDao;
    @Autowired
    private JobSeekerDao jobSeekerDao;

    public void jobSeekerAdd(JobSeekerDto jobSeekerDto) {
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

    }



}
