package kodlamaio.hrms.dto;

import kodlamaio.hrms.entities.concretes.Languages;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
public class LanguagesDto {

    private String languageName;
    private short grade;

    public LanguagesDto(Languages languages) {
        this.languageName = languages.getLanguageName();
        this.grade = languages.getGrade();
    }
}
