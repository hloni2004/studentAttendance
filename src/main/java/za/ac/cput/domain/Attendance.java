package za.ac.cput.domain;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendanceId ;
    private Date date ;
    private Time time;

    @ManyToOne
    @JoinColumn(name = "student_id",nullable = false)
    private Scholar scholar;

    public Attendance() {

    }

    protected Attendance(Builder attendance) {
        this.attendanceId = attendance.attendanceId;
        this.date = attendance.date;
        this.time = attendance.time;
        this.scholar = attendance.scholar;

    }

    public Time getTime() {
        return time;
    }

    public Long getAttendanceId() {
        return attendanceId;
    }

    public Date getDate() {
        return date;
    }

    public Scholar getScholar() {
        return scholar;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "attendanceId=" + attendanceId +
                ", date=" + date +
                ", time=" + time +
                ", scholar=" + scholar +
                '}';
    }

    public static class Builder{
        private Long attendanceId;
        private Date date;
        private Time time;
        private Scholar scholar;

        public Builder setAttendanceId(Long attendanceId) {
            this.attendanceId = attendanceId;
            return this;
        }

        public Builder setDate(Date date) {
            this.date = date;
            return this;
        }

        public Builder setTime(Time time) {
            this.time = time;
            return this;
        }

        public Builder setScholar(Scholar scholar) {
            this.scholar = scholar;
            return this;
        }

        public Builder copy(Attendance attendance) {
            this.attendanceId = attendance.attendanceId;
            this.date = attendance.date;
            this.time = attendance.time;
            this.scholar = attendance.scholar;
            return this;
        }

        public Attendance build() {
            return new Attendance(this);
        }
    }
}
