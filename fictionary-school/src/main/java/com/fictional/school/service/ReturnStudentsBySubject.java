package com.fictional.school.service;

import com.fictional.school.dto.*;
import com.fictional.school.entities.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReturnStudentsBySubject {

    public List<BestMathStudentDTO> getMathStudents(List<Student> studentsFromRepo) {
        List<BestMathStudentDTO> bestMathStudents = new ArrayList<>();

        for (Student student : studentsFromRepo) {
            BestMathStudentDTO mathStudent = new BestMathStudentDTO();

            mathStudent.setFirstName(student.getFirstName());
            mathStudent.setLastName(student.getLastName());
            mathStudent.setClassName(student.getStudentClass());
            mathStudent.setMathMarksAverage(student.getMathMarksAverage());

            bestMathStudents.add(mathStudent);
        }

        return bestMathStudents;
    }

    public List<BestPhysicsStudentDTO> getPhysicsStudents(List<Student> studentsFromRepo) {
        List<BestPhysicsStudentDTO> bestPhysicsStudents = new ArrayList<>();

        for (Student student : studentsFromRepo) {
            BestPhysicsStudentDTO physicsStudent = new BestPhysicsStudentDTO();

            physicsStudent.setFirstName(student.getFirstName());
            physicsStudent.setLastName(student.getLastName());
            physicsStudent.setClassName(student.getStudentClass());
            physicsStudent.setPhysicsMarksAverage(student.getPhysicsMarksAverage());

            bestPhysicsStudents.add(physicsStudent);
        }

        return bestPhysicsStudents;
    }

    public List<BestBiologyStudentDTO> getBiologyStudents(List<Student> studentsFromRepo) {
        List<BestBiologyStudentDTO> bestBiologyStudents = new ArrayList<>();

        for (Student student : studentsFromRepo) {
            BestBiologyStudentDTO biologyStudent = new BestBiologyStudentDTO();

            biologyStudent.setFirstName(student.getFirstName());
            biologyStudent.setLastName(student.getLastName());
            biologyStudent.setClassName(student.getStudentClass());
            biologyStudent.setBiologyMarksAverage(student.getBiologyMarksAverage());

            bestBiologyStudents.add(biologyStudent);
        }

        return bestBiologyStudents;
    }

    public List<BestGeographyStudentDTO> getGeographyStudents(List<Student> studentsFromRepo) {
        List<BestGeographyStudentDTO> bestGeographyStudents = new ArrayList<>();

        for (Student student : studentsFromRepo) {
            BestGeographyStudentDTO geographyStudent = new BestGeographyStudentDTO();

            geographyStudent.setFirstName(student.getFirstName());
            geographyStudent.setLastName(student.getLastName());
            geographyStudent.setClassName(student.getStudentClass());
            geographyStudent.setGeographyMarksAverage(student.getGeographyMarksAverage());

            bestGeographyStudents.add(geographyStudent);
        }

        return bestGeographyStudents;
    }

    public List<BestEnglishStudentDTO> getEnglishStudents(List<Student> studentsFromRepo) {
        List<BestEnglishStudentDTO> bestEnglishStudents = new ArrayList<>();

        for (Student student : studentsFromRepo) {
            BestEnglishStudentDTO englishStudent = new BestEnglishStudentDTO();

            englishStudent.setFirstName(student.getFirstName());
            englishStudent.setLastName(student.getLastName());
            englishStudent.setClassName(student.getStudentClass());
            englishStudent.setEnglishMarksAverage(student.getEnglishMarksAverage());

            bestEnglishStudents.add(englishStudent);
        }

        return bestEnglishStudents;
    }

}
