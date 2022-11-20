package com.fictional.school.entities;

import com.fictional.school.calculator.TotalMarksAverageCalculator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;

    @Column(
            name = "first_name",
            length = 20,
            nullable = false
    )
    private String firstName;

    @Column(
            name = "last_name",
            length = 20,
            nullable = false
    )
    private String lastName;

    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_student_id", referencedColumnName = "student_id")
    private List<Marks> marks;

    @Column(name = "total_marks_average")
    private Double totalMarksAverage;

    @Column(name = "math_marks_average")
    private Double mathMarksAverage;

    @Column(name = "physics_marks_average")
    private Double physicsMarksAverage;

    @Column(name = "biology_marks_average")
    private Double biologyMarksAverage;

    @Column(name = "english_marks_average")
    private Double englishMarksAverage;

    @Column(name = "geography_marks_average")
    private Double geographyMarksAverage;

    @Column(name = "student_class")
    private String studentClass;


    // Transient variable

    @Transient
    private TotalMarksAverageCalculator tmac = TotalMarksAverageCalculator.getInstance();

    // Constructors

    public Student(String firstName, String lastName, List<Marks> marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
        this.totalMarksAverage = tmac.calculateAverage(this.marks);
        this.biologyMarksAverage = tmac.calculateAverageBySubject(this.marks, "Biology");
        this.englishMarksAverage = tmac.calculateAverageBySubject(this.marks, "English");
        this.mathMarksAverage = tmac.calculateAverageBySubject(this.marks, "Math");
        this.physicsMarksAverage = tmac.calculateAverageBySubject(this.marks, "Physics");
        this.geographyMarksAverage = tmac.calculateAverageBySubject(this.marks, "Geography");
    }

    public Student() {
    }

    // Getter and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Marks> getMarks() {
        return marks;
    }

    public void setMarks(List<Marks> marks) {
        this.marks = marks;
    }

    public Double getTotalMarksAverage() {
        return tmac.calculateAverage(this.marks);
    }

    public void setTotalMarksAverage(Double totalMarksAverage) {
        this.totalMarksAverage = totalMarksAverage;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public Double getMathMarksAverage() {
        return mathMarksAverage;
    }

    public Double getPhysicsMarksAverage() {
        return tmac.calculateAverageBySubject(this.marks, "Physics");
    }

    public Double getBiologyMarksAverage() {
        return tmac.calculateAverageBySubject(this.marks, "Biology");
    }

    public Double getEnglishMarksAverage() {
        return tmac.calculateAverageBySubject(this.marks, "English");
    }

    public Double getGeographyMarksAverage() {
        return tmac.calculateAverageBySubject(this.marks, "Geography");
    }
}
