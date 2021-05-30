package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvert;
import kodlamaio.hrms.service.abstracts.JobAdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobadverts")
public class JobAdvertsController {

    private final JobAdvertService jobAdvertService;

    public JobAdvertsController(JobAdvertService jobAdvertService) {
        this.jobAdvertService = jobAdvertService;
    }

    @PostMapping("/add")
    public Result jobAdvertAdd(@RequestBody JobAdvert jobAdvert) {
        return jobAdvertService.jobAdvertAdd(jobAdvert);
    }

    @GetMapping("/getAll")
    public Result getJobAdverts(){
        return jobAdvertService.getJobAdverts();
    }

    @GetMapping("/getAllDescDates")
    public Result getJobAdvertsDescDates() {
        return jobAdvertService.getJobAdvertsDescDates();
    }

    @GetMapping("/getAllByCompany")
    public Result getAllByCompany(@RequestParam("companyName") String companyName) {
        return jobAdvertService.getAllByCompany(companyName);
    }

    @PostMapping("/closeAdvert/{jobAdvertId}")
    public Result closeAdvert(@PathVariable("jobAdvertId") int jobAdvertId) {
        return jobAdvertService.closeAdvert(jobAdvertId);
    }
}
