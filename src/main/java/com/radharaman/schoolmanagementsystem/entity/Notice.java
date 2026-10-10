package com.radharaman.schoolmanagementsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "notices")
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_id")
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(name = "notice_date")
    private String noticeDate;

    @Column(columnDefinition = "TEXT")
    private String description;

    public Notice() {}

    public Notice(String title, String noticeDate, String description) {
        this.title = title;
        this.noticeDate = noticeDate;
        this.description = description;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getNoticeDate() { return noticeDate; }
    public void setNoticeDate(String noticeDate) { this.noticeDate = noticeDate; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
