package kodlamaio.hrms.entities.concretes;

import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "job_seekers")
public class JobSeeker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firsName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "nationality_id", length = 11)
    private Long nationalId;

    @Column(name = "year_of_birth", length = 4)
    private int yearOfBirth;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "jobSeeker", cascade = CascadeType.ALL)
    private List<Candidate> candidate;
}
