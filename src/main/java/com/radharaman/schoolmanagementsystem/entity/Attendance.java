package com.radharaman.schoolmanagementsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_id")
    private Long id;

    private String date;

    @Column(name = "class_name")
    private String className;

    private String status; // "Present" or "Absent"

    @Column(name = "roll_number")
    private Long rollNumber;

    @Column(name = "student_name")
    private String studentName;

    public Attendance() {}

    public Attendance(String date, String className, String status, Long rollNumber, String studentName) {
        this.date = date;
        this.className = className;
        this.status = status;
        this.rollNumber = rollNumber;
        this.studentName = studentName;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Long getRollNumber() { return rollNumber; }
    public void setRollNumber(Long rollNumber) { this.rollNumber = rollNumber; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
}
