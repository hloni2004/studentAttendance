package za.ac.cput.factory;

import za.ac.cput.domain.Attendance;
import za.ac.cput.domain.Scholar;
import za.ac.cput.util.Helper;

import java.sql.Date;
import java.sql.Time;

public class AttendanceFactory {

    public static Attendance createAttendance( Date date, Time time, Scholar scholar) {
        if (
                date == null ||
                time == null ||
                scholar == null) {
            return null;
        }

        return new Attendance.Builder()
                .setDate(date)
                .setTime(time)
                .setScholar(scholar)
                .build();
    }
}
