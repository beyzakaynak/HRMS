package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorDao extends JpaRepository <Administrator,Integer> {
}
