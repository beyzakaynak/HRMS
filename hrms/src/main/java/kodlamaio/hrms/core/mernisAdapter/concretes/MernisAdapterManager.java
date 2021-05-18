package kodlamaio.hrms.core.mernisAdapter.concretes;

import kodlamaio.hrms.core.mernisAdapter.abstracts.MernisAdapterService;
import kodlamaio.hrms.dto.JobSeekerDto;
import kodlamaio.hrms.mernis.BRPKPSPublicSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MernisAdapterManager implements MernisAdapterService {
    @Autowired
    private BRPKPSPublicSoap brpkpsPublicSoap;


    @Override
    public Boolean verifyNationalityId(JobSeekerDto jobSeekerDto) throws Exception {

        return brpkpsPublicSoap.TCKimlikNoDogrula(jobSeekerDto.getNationalId(), jobSeekerDto.getFirstName(), jobSeekerDto.getLastName(), jobSeekerDto.getYearOfBirth());


    }
}
