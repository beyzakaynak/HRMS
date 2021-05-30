package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobAdvert;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobAdvertDao extends JpaRepository<JobAdvert,Integer> {

    List<JobAdvert> getByEmployer_CompanyName(String companyName);

    List<JobAdvert> getByEmployer_CompanyNameAndIsOpen(String companyName, Boolean isOpen);

    List<JobAdvert> getAllByIsOpen(Boolean open);

    List<JobAdvert> getAllByIsOpen(Boolean open, Sort sort);
}
