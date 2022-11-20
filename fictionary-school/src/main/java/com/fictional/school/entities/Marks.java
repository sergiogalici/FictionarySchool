package com.fictional.school.entities;

import javax.persistence.*;

@Entity
@Table
public class Marks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mark_id", nullable = false)
    private Long id;

    @Column(name = "subject", length = 61, nullable = false)
    private String subject;

    @Column(name = "mark_amount")
    private Double markAmount;

    @Column(name = "fk_student_id", insertable = false, updatable = false)
    private Long studentId;

    // Constructors

    public Marks() {
    }

    public Marks(String subject, Double markAmount) {
        this.subject = subject;
        this.markAmount = markAmount;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getMarkAmount() {
        return markAmount;
    }

    public void setMarkAmount(Double markAmount) {
        this.markAmount = markAmount;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
