package kodlamaio.hrms.service.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvert;

public interface JobAdvertService {

    Result jobAdvertAdd(JobAdvert jobAdvert);

    Result getJobAdverts();

    Result getJobAdvertsDescDates();

    Result getAllByCompany(String companyName);

    Result closeAdvert(int jobAdvertId);
}
