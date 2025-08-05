package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Attendance;
import za.ac.cput.repository.AttendanceRepository;

@Service
public class AttendanceService implements IAttendanceService {

    private final AttendanceRepository attendanceRepository;

    @Autowired
    public AttendanceService(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    @Override
    public Attendance create(Attendance attendance) {
        return this.attendanceRepository.save(attendance);
    }

    @Override
    public Attendance update(Attendance attendance) {
        return this.attendanceRepository.save(attendance);
    }

    @Override
    public Attendance read(Long id) {
        return this.attendanceRepository.findById(id).orElse(null);
    }

    @Override
    public boolean delete(Long id) {
        if (this.attendanceRepository.existsById(id)) {
            this.attendanceRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
