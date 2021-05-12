package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.service.abstracts.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
    EmployerService employerService;

    @Autowired
    public EmployersController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @GetMapping("/getall")
    public List<Employer> getAll() {
        return employerService.getAll();

    }
}