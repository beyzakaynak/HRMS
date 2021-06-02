package kodlamaio.hrms.dto;

import kodlamaio.hrms.entities.concretes.School;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class SchoolDto {

    private String school;
    private String schoolDepartment;
    private LocalDate startingYearOfSchool;
    private LocalDate graduationYearOfSchool;

    public SchoolDto(School school) {
        this.school = school.getSchool();
        this.schoolDepartment = school.getSchoolDepartment();
        this.startingYearOfSchool = school.getStartingYearOfSchool();
        this.graduationYearOfSchool = school.getGraduationYearOfSchool();
    }
}
