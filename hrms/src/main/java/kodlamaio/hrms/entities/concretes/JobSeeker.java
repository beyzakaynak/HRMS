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

    @Column(name = "first_name")
    @NotNull
    private String firsName;

    @Column(name = "last_name")
    @NotNull
    private String lastName;

    @Column(name = "nationality_id", length = 11)
    @NotNull
    private String nationalId;

    @Column(name = "year_of_birth", length = 4)
    @NotNull
    private String yearOfBirth;

    @OneToOne

    private User user;
}
