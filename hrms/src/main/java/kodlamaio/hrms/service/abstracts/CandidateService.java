package kodlamaio.hrms.service.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.dto.CandidateDto;
import kodlamaio.hrms.entities.concretes.Candidate;

public interface CandidateService {

    Result candidateAdd(CandidateDto candidateDto);
}
