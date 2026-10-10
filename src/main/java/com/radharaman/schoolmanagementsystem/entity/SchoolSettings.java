package com.radharaman.schoolmanagementsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "school_settings")
public class SchoolSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "setting_id")
    private Long id;

    @Column(name = "school_name")
    private String schoolName;

    private String address;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "admin_name")
    private String adminName;

    @Column(name = "admin_email")
    private String adminEmail;

    private String language;

    public SchoolSettings() {}

    public SchoolSettings(String schoolName, String address, String contactNumber, String adminName, String adminEmail, String language) {
        this.schoolName = schoolName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.adminName = adminName;
        this.adminEmail = adminEmail;
        this.language = language;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSchoolName() { return schoolName; }
    public void setSchoolName(String schoolName) { this.schoolName = schoolName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public String getAdminName() { return adminName; }
    public void setAdminName(String adminName) { this.adminName = adminName; }

    public String getAdminEmail() { return adminEmail; }
    public void setAdminEmail(String adminEmail) { this.adminEmail = adminEmail; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }
}
