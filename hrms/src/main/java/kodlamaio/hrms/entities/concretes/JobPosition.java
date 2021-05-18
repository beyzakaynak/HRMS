package kodlamaio.hrms.entities.concretes;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "job_positions")

public class JobPosition {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    @NotNull
    private String name;
}

