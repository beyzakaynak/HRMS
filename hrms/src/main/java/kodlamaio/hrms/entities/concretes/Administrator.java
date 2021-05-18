package kodlamaio.hrms.entities.concretes;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "administrators")

public class Administrator {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "first_name", nullable = false)
    @NotNull
    private String firsName;

    @Column(name = "last_name", nullable = false)
    @NotNull
    private String lastName;

    @OneToOne

    private User user;
}
