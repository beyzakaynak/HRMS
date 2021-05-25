package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.dto.JobSeekerDto;
import kodlamaio.hrms.service.concretes.JobSeekerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekerController {
    @Autowired
    private JobSeekerManager jobSeekerManager;

    @GetMapping("/getall")
    public Result getAllJobSeekers() {
        return jobSeekerManager.getAllJobSeekers();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobSeekerDto jobSeekerDto) throws Exception {
        return jobSeekerManager.jobSeekerAdd(jobSeekerDto);
    }
}
