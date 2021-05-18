package kodlamaio.hrms.entities.concretes;

import com.sun.istack.NotNull;
import lombok.Data;


import javax.persistence.*;

@Entity
@Data
@Table(name = "job_seekers")

public class JobSeeker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name", nullable = false)
    @NotNull
    private String firsName;

    @Column(name = "last_name", nullable = false)
    @NotNull
    private String lastName;

    @Column(name = "nationality_id", length = 11, unique = true, nullable = false)
    @NotNull
    private Long nationalId;

    @Column(name = "year_of_birth", length = 4, nullable = false)
    @NotNull
    private int yearOfBirth;

    @OneToOne

    private User user;
}
