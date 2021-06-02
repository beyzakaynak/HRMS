package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidates")
public class Candidate {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_photo")
    private String userPhoto;

    @Column(name = "github_link")
    private String github;

    @Column(name = "linkedin_link")
    private String linkedin;

    @Column(name = "summary_information")
    private String summaryInformation;

    @Column(name = "known_technologies")
    private String knownTechnologies;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<JobExperience> jobExperiences;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<School> schoolList;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<Languages> languages;

    @ManyToOne
    private JobSeeker jobSeeker;

}
