package kodlamaio.hrms.entities.concretes;

import kodlamaio.hrms.dto.LanguagesDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "languages")
public class Languages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "language_name")
    private String languageName;

    @Column(name = "grade")
    private short grade;

    @ManyToOne
    private Candidate candidate;

    public Languages(LanguagesDto languagesDto) {
        this.languageName = languagesDto.getLanguageName();
        this.grade = languagesDto.getGrade();
    }
}
