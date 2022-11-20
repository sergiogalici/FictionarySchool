package com.fictional.school.repository;

import com.fictional.school.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

    @Query(
            value = "SELECT * FROM student ORDER BY math_marks_average DESC LIMIT 20",
            nativeQuery = true
    )
    List<Student> getStudentsOrderByMathMarks();

    @Query(
            value = "SELECT * FROM student ORDER BY physics_marks_average DESC LIMIT 20",
            nativeQuery = true
    )
    List<Student> getStudentsOrderByPhysicsMarks();

    @Query(
            value = "SELECT * FROM student ORDER BY geography_marks_average DESC LIMIT 20",
            nativeQuery = true
    )
    List<Student> getStudentsOrderByGeographyMarks();

    @Query(
            value = "SELECT * FROM student ORDER BY english_marks_average DESC LIMIT 20",
            nativeQuery = true
    )
    List<Student> getStudentsOrderByEnglishMarks();

    @Query(
            value = "SELECT * FROM student ORDER BY biology_marks_average DESC LIMIT 20",
            nativeQuery = true
    )
    List<Student> getStudentsOrderByBiologyMarks();

}
