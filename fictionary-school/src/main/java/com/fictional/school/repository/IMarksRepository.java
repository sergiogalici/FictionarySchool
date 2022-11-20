package com.fictional.school.repository;

import com.fictional.school.entities.Marks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMarksRepository extends JpaRepository<Marks, Long> {

    List<Marks> findMarksBySubject(String subject);

    List<Marks> findMarksByStudentId(Long studentId);
}
