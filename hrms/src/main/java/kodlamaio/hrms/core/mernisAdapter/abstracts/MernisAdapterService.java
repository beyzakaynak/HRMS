package kodlamaio.hrms.core.mernisAdapter.abstracts;

import kodlamaio.hrms.dto.JobSeekerDto;

public interface MernisAdapterService {
    Boolean verifyNationalityId(JobSeekerDto jobSeekerDto) throws Exception;
}
