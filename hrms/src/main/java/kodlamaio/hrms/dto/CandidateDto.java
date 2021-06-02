package kodlamaio.hrms.dto;

import kodlamaio.hrms.entities.concretes.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class CandidateDto {

    private int id;
    private String userPhoto;
    private String github;
    private String linkedin;
    private String summaryInformation;
    private String knownTechnologies;
    private List<JobExperienceDto> jobExperiences;
    private List<SchoolDto> schoolList;
    private List<LanguagesDto> languages;
    private JobSeekerDto jobSeeker;

    public CandidateDto(Candidate candidate) {
        this.id = candidate.getId();
        this.userPhoto = candidate.getUserPhoto();
        this.github = candidate.getGithub();
        this.linkedin = candidate.getLinkedin();
        this.summaryInformation = candidate.getSummaryInformation();
        this.knownTechnologies = candidate.getKnownTechnologies();
        this.jobExperiences = candidate.getJobExperiences().stream().map(JobExperienceDto::new).collect(Collectors.toList());
        this.schoolList = candidate.getSchoolList().stream().map(SchoolDto::new).collect(Collectors.toList());
        this.languages = candidate.getLanguages().stream().map(LanguagesDto::new).collect(Collectors.toList());
        this.jobSeeker = new JobSeekerDto(candidate.getJobSeeker());
    }
}
