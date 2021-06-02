package kodlamaio.hrms.service.concretes;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.dto.CandidateDto;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.service.abstracts.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateManager implements CandidateService {

    @Autowired
    private CandidateDao candidateDao;

    @Override
    public Result candidateAdd(CandidateDto candidateDto) {
        Candidate candidate = new Candidate(candidateDto);
        return new DataResult<>(candidateDao.save(candidate),true);
    }
}
