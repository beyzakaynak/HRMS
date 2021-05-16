package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.dto.JobSeekerDto;
import kodlamaio.hrms.service.concretes.JobSeekerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JobSeekerController {
    @Autowired
    private JobSeekerManager jobSeekerManager;

    @PostMapping("/add")
    public void add(@RequestBody JobSeekerDto jobSeekerDto) {
        jobSeekerManager.jobSeekerAdd(jobSeekerDto);
    }
}
