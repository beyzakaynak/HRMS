package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.dto.EmployerDto;
import kodlamaio.hrms.dto.JobSeekerDto;
import kodlamaio.hrms.service.concretes.EmployerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

    @Autowired
    private EmployerManager employerManager;

    @GetMapping("/getall")
    public Result getAllEmployers() {
        return employerManager.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody EmployerDto employerDto) throws Exception {
        return employerManager.add(employerDto);
    }

}
