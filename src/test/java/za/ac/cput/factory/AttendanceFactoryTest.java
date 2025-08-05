package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Attendance;
import za.ac.cput.domain.Scholar;

import java.sql.Date;
import java.sql.Time;

import static org.junit.jupiter.api.Assertions.*;

class AttendanceFactoryTest {

    @Test
    void createAttendance() {
        // Arrange: create scholar and attendance date/time
        Scholar scholar = ScholarFactory.createScholar("Neo", "Mokoena", "neo.mokoena@gmail.com");
        Date date = Date.valueOf("2025-08-05"); // yyyy-MM-dd
        Time time = Time.valueOf("09:00:00");   // HH:mm:ss


        Attendance attendance = AttendanceFactory.createAttendance(date, time, scholar);


        assertNotNull(attendance);

        System.out.println(attendance);
    }
}
