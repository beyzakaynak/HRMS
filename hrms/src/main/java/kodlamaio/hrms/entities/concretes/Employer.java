package kodlamaio.hrms.entities.concretes;

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

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "website",nullable = false)
    private String website;

    @Column(name = "phone_number",length = 11,nullable = false)
    private Long phoneNumber;

    @OneToOne
    private User user;

}
