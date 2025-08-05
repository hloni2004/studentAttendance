package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Scholar;
@Repository
public interface ScholarRepository extends JpaRepository<Scholar,Long> {

}
