package com.radharaman.schoolmanagementsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "marks")
public class Mark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mark_id")
    private Long id;

    @Column(name = "roll_number", nullable = false)
    private Long rollNumber;

    @Column(name = "class_name")
    private String className;

    private String subject;
    private String exam;

    @Column(name = "marks_obtained")
    private double marksObtained;

    private String grade;

    public Mark() {}

    public Mark(Long rollNumber, String className, String subject, String exam, double marksObtained, String grade) {
        this.rollNumber = rollNumber;
        this.className = className;
        this.subject = subject;
        this.exam = exam;
        this.marksObtained = marksObtained;
        this.grade = grade;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getRollNumber() { return rollNumber; }
    public void setRollNumber(Long rollNumber) { this.rollNumber = rollNumber; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getExam() { return exam; }
    public void setExam(String exam) { this.exam = exam; }

    public double getMarksObtained() { return marksObtained; }
    public void setMarksObtained(double marksObtained) { this.marksObtained = marksObtained; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}
