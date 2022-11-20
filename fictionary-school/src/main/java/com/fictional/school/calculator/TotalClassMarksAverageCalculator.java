package com.fictional.school.calculator;

import com.fictional.school.entities.Student;

import java.util.List;

public class TotalClassMarksAverageCalculator {

    private static TotalClassMarksAverageCalculator instance;

    private TotalClassMarksAverageCalculator() {
    }

    public static TotalClassMarksAverageCalculator getInstance() {
        if(instance == null) {
            instance = new TotalClassMarksAverageCalculator();
        }

        return instance;
    }

    public Double getClassTotalMarks(List<Student> studentsInClass) {
        Double classMarksAverage = 0.0;

        for(Student student : studentsInClass) {
            classMarksAverage += student.getTotalMarksAverage();
        }

        return (double) Math.round((classMarksAverage / studentsInClass.size()) * 100.0) / 100.0;
    }
}
