package com.radharaman.schoolmanagementsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "fee_payments")
public class FeePayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "student_name", nullable = false)
    private String studentName;

    @Column(name = "class_name")
    private String className;

    @Column(name = "paid_amount")
    private double paidAmount;

    @Column(name = "remaining_amount")
    private double remainingAmount;

    @Column(name = "payment_date")
    private String paymentDate;

    public FeePayment() {}

    public FeePayment(String studentName, String className, double paidAmount, double remainingAmount, String paymentDate) {
        this.studentName = studentName;
        this.className = className;
        this.paidAmount = paidAmount;
        this.remainingAmount = remainingAmount;
        this.paymentDate = paymentDate;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public double getPaidAmount() { return paidAmount; }
    public void setPaidAmount(double paidAmount) { this.paidAmount = paidAmount; }

    public double getRemainingAmount() { return remainingAmount; }
    public void setRemainingAmount(double remainingAmount) { this.remainingAmount = remainingAmount; }

    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) { this.paymentDate = paymentDate; }
}
