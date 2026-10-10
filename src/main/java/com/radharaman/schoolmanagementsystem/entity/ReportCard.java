package com.radharaman.schoolmanagementsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "report_cards")
public class ReportCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "academic_year")
    private String academicYear;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "class_name")
    private String className;

    @Column(name = "total_marks")
    private double totalMarks;

    @Column(name = "marks_obtained")
    private double marksObtained;

    private String grade;

    public ReportCard() {}

    public ReportCard(String academicYear, String studentName, String fatherName, String className, double totalMarks, double marksObtained, String grade) {
        this.academicYear = academicYear;
        this.studentName = studentName;
        this.fatherName = fatherName;
        this.className = className;
        this.totalMarks = totalMarks;
        this.marksObtained = marksObtained;
        this.grade = grade;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAcademicYear() { return academicYear; }
    public void setAcademicYear(String academicYear) { this.academicYear = academicYear; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getFatherName() { return fatherName; }
    public void setFatherName(String fatherName) { this.fatherName = fatherName; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public double getTotalMarks() { return totalMarks; }
    public void setTotalMarks(double totalMarks) { this.totalMarks = totalMarks; }

    public double getMarksObtained() { return marksObtained; }
    public void setMarksObtained(double marksObtained) { this.marksObtained = marksObtained; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}
