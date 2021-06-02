package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.service.abstracts.CandidateService;
import kodlamaio.hrms.service.concretes.CandidateManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    @Autowired
    private CandidateManager candidateManager;

    @PostMapping("/add")
    public Result addCandidate(@RequestBody Candidate candidate) {
        return candidateManager.candidateAdd(candidate);
    }
}
