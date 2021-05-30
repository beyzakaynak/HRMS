package kodlamaio.hrms.entities.concretes;

import kodlamaio.hrms.core.utilities.enums.Cities;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "job_adverts")
@EntityListeners(AuditingEntityListener.class)
public class JobAdvert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "job_description")
    private String jobDescription;

    @Column(name = "max_salary")
    private Long maxSalary;

    @Column(name = "min_salary")
    private Long minSalary;

    @Column(name = "open_positions")
    private Integer openPositions;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "deadline")
    private Date deadline;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(name = "release_date")
    private Date releaseDate;

    @Enumerated
    @Column(name = "city")
    private Cities city;

    @Column(name = "is_open")
    private Boolean isOpen;

    @ManyToOne(cascade = CascadeType.ALL)
    private JobPosition jobPosition;

    @ManyToOne(cascade = CascadeType.ALL)
    private Employer employer;

}
