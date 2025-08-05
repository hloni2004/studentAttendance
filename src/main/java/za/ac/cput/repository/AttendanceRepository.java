package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Attendance;
@Repository
public interface AttendanceRepository extends JpaRepository<Attendance,Long> {


}
