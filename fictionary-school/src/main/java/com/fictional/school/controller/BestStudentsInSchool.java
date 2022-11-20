package com.fictional.school.controller;

import com.fictional.school.dto.BestStudentParent;
import com.fictional.school.service.StudentService;
import com.fictional.school.dto.BestStudentDTO;
import com.fictional.school.entities.Student;
import com.fictional.school.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/school/best/student")
public class BestStudentsInSchool {

    @Autowired
    private StudentService ss;

    @Autowired
    private IStudentRepository sr;

    @GetMapping
    public List<BestStudentDTO> getBestStudentsInSchool() {

        return ss.getBestStudentsInSchool();
    }

    @GetMapping("/{subject}")
    public List<? extends BestStudentParent> getBestMathStudents(@PathVariable String subject) {
        String subjectFirstLetterCapital = subject.substring(0, 1).toUpperCase() + subject.substring(1);
        return ss.getBestStudentsBySubject(subjectFirstLetterCapital);
    }

    @GetMapping("/prova")
    public List<Student> getProva() {
        return sr.getStudentsOrderByMathMarks();
    }
}
