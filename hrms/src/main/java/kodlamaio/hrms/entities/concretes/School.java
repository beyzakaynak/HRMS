package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="schools")
public class School {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "school")
    private String school;

    @Column(name = "school_department")
    private String schoolDepartment;

    @Column(name = "starting_year_of_school")
    private LocalDate startingYearOfSchool;

    @Column(name = "graduation_year_of_school")
    private LocalDate graduationYearOfSchool;

    @ManyToOne
    private Candidate candidate;
}
