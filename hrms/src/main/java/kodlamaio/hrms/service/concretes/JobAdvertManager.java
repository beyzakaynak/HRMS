package kodlamaio.hrms.service.concretes;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertDao;
import kodlamaio.hrms.dto.JobAdvertGetAllDto;
import kodlamaio.hrms.entities.concretes.JobAdvert;
import kodlamaio.hrms.service.abstracts.JobAdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JobAdvertManager implements JobAdvertService {

    @Autowired
    private JobAdvertDao jobAdvertDao;

    @Override
    public Result jobAdvertAdd(JobAdvert jobAdvert) {

        if (jobAdvert.getJobPosition() == null) {
            return new ErrorResult("iş poziyonu boş kalamaz");
        }
        if (jobAdvert.getJobDescription() == null) {
            return new ErrorResult("iş tanımı boş kalamaz");
        }
        if (jobAdvert.getCity() == null) {
            return new ErrorResult("şehir bilgisi boş kalamaz");
        }
        if (jobAdvert.getOpenPositions() == null) {
            return new ErrorResult("pozisyon adedi boş kalamaz");
        }

        jobAdvert.setIsOpen(true);
        JobAdvert inDb = jobAdvertDao.save(jobAdvert);
        return new DataResult<>(inDb,true);
    }

    @Override
    public Result getJobAdverts() {
        List<JobAdvert> jobAdverts = jobAdvertDao.getAllByIsOpen(Boolean.TRUE);
        List<JobAdvertGetAllDto> jobAdvertGetAllDtos = jobAdverts.stream().map(JobAdvertGetAllDto::new).collect(Collectors.toList());
        return new DataResult<>(jobAdvertGetAllDtos,true);
    }

    @Override
    public Result getJobAdvertsDescDates() {
        Sort sortDescDates = Sort.by(Sort.Direction.DESC,"releaseDate");
        List<JobAdvert> jobAdverts = jobAdvertDao.getAllByIsOpen(Boolean.TRUE,sortDescDates);
        List<JobAdvertGetAllDto> jobAdvertGetAllDtos = jobAdverts.stream().map(JobAdvertGetAllDto::new).collect(Collectors.toList());
        return new DataResult<>(jobAdvertGetAllDtos,true);
    }

    @Override
    public Result getAllByCompany(String companyName) {
        List<JobAdvert> jobAdverts = jobAdvertDao.getByEmployer_CompanyNameAndIsOpen(companyName,true);
        List<JobAdvertGetAllDto> jobAdvertGetAllDtos = jobAdverts.stream().map(JobAdvertGetAllDto::new).collect(Collectors.toList());
        return new DataResult<>(jobAdvertGetAllDtos,true);
    }

    @Override
    public Result closeAdvert(int jobAdvertId) {
        Optional<JobAdvert> advertOptional = jobAdvertDao.findById(jobAdvertId);
        if (advertOptional.isPresent()){
            JobAdvert jobAdvert = advertOptional.get();
            jobAdvert.setIsOpen(false);
            jobAdvertDao.save(jobAdvert);
        } else {
            return new ErrorResult("böyle bir ilan yok.");
        }
        return new SuccessResult("ilan pasifleştirildi.");
    }

}
