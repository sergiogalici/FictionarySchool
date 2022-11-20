package com.fictional.school.service;

import com.fictional.school.comparator.StudentsMarksComparator;
import com.fictional.school.dto.BestStudentDTO;
import com.fictional.school.dto.BestStudentParent;
import com.fictional.school.entities.Student;
import com.fictional.school.repository.IMarksRepository;
import com.fictional.school.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    @Autowired
    private IStudentRepository sr;

    @Autowired
    private IMarksRepository mr;

    @Autowired
    private ReturnStudentsBySubject rsbs;

    // BEST IN GENERAL
    public List<BestStudentDTO> getBestStudentsInSchool() {
        List<Student> students = sr.findAll();
        students.sort(new StudentsMarksComparator());
        Collections.reverse(students);

        List<Student> studentsToReturn = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            studentsToReturn.add(students.get(i));
        }

        List<BestStudentDTO> studentsDTO = new ArrayList<>();

        for(int i = 0; i < studentsToReturn.size(); i++) {
            Student currentStudent = studentsToReturn.get(i);

            BestStudentDTO studentToAdd = new BestStudentDTO();
            studentToAdd.setFirstName(currentStudent.getFirstName());
            studentToAdd.setLastName(currentStudent.getLastName());
            studentToAdd.setClassName(currentStudent.getStudentClass());
            studentToAdd.setTotalMarksAverage(currentStudent.getTotalMarksAverage());

            studentsDTO.add(studentToAdd);
        }

        return studentsDTO;
    }

    // BEST BY SUBJECT

    public List<? extends BestStudentParent> getBestStudentsBySubject(String subject) {
        List<Student> studentsFromRepo = new ArrayList<>();

        switch (subject) {
            case "Math" -> {
                return rsbs.getMathStudents(sr.getStudentsOrderByMathMarks());
            }
            case "Biology" -> {
                return rsbs.getBiologyStudents(sr.getStudentsOrderByBiologyMarks());
            }
            case "Geography" -> {
                return rsbs.getGeographyStudents(sr.getStudentsOrderByGeographyMarks());
            }
            case "Physics" -> {
                return rsbs.getPhysicsStudents(sr.getStudentsOrderByPhysicsMarks());
            }
            case "English" -> {
                return rsbs.getEnglishStudents(sr.getStudentsOrderByEnglishMarks());
            }
        }

        return Collections.emptyList();
    }

}
