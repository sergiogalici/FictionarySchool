package com.fictional.school.entities;

import com.fictional.school.generators.ClassNameGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class SchoolClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Long id;

    @Column(name = "class_name")
    private String name;

    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "fk_class_id", referencedColumnName = "class_id")
    private List<Student> students;

    @Column(name = "class_marks_average")
    private Double classMarksAverage;

    @Transient
    private ClassNameGenerator cng = ClassNameGenerator.getInstance();

    public SchoolClass(List<Student> students) {
        this.students = students;
        this.totalStudents = this.students.size();
    }

    public SchoolClass() {
    }

    @Column(name = "students_total")
    private Integer totalStudents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Integer getTotalStudents() {
        return this.students.size();
    }

    public void setTotalStudents(Integer totalStudents) {
        this.totalStudents = totalStudents;
    }

    public Double getClassMarksAverage() {
        return classMarksAverage;
    }

    public void setClassMarksAverage(Double classMarksAverage) {
        this.classMarksAverage = classMarksAverage;
    }


}
