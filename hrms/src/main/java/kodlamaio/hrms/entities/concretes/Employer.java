package kodlamaio.hrms.entities.concretes;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employers")

public class Employer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "company_name",unique = true)
    @NotNull
    private String companyName;

    @Column(name = "website",unique = true)
    @NotNull
    private String website;

    @Column(name = "phone_number",length = 11,unique = true)
    @NotNull
    private Long phoneNumber;

    @OneToOne
    @NotNull
    private User user;

}
