package com.fictional.school.calculator;

import com.fictional.school.entities.Marks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TotalMarksAverageCalculator {

    private static TotalMarksAverageCalculator instance;

    private TotalMarksAverageCalculator() {
    }

    public static TotalMarksAverageCalculator getInstance() {
        if(instance == null) {
            instance = new TotalMarksAverageCalculator();
        }

        return instance;
    }

    public Double calculateAverage(List<Marks> marks) {
        Double totalMarks = 0.0;

        for (Marks mark : marks) {
            totalMarks += mark.getMarkAmount();
        }

        Double average = (double) Math.round((totalMarks / marks.size()) * 100.0) / 100.0;

        return average;
    }

    public Double calculateAverageBySubject(List<Marks> marks, String subject) {
        Double totalMarks = 0.0;
        List<Marks> marksBySubject = new ArrayList<>();

        switch (subject) {
            case "Math" -> marksBySubject = marks.stream().filter(
                    m -> Objects.equals(m.getSubject(), "Math")
            ).toList();
            case "Geography" -> marksBySubject = marks.stream().filter(
                    m -> Objects.equals(m.getSubject(), "Geography")
            ).toList();
            case "Physics" -> marksBySubject = marks.stream().filter(
                    m -> Objects.equals(m.getSubject(), "Physics")
            ).toList();
            case "English" -> marksBySubject = marks.stream().filter(
                    m -> Objects.equals(m.getSubject(), "English")
            ).toList();
            case "Biology" -> marksBySubject = marks.stream().filter(
                    m -> Objects.equals(m.getSubject(), "Biology")
            ).toList();
        }

        for (Marks mark : marksBySubject) {
            totalMarks += mark.getMarkAmount();
        }

        Double average = (double) Math.round((totalMarks / marksBySubject.size()) * 100.0) / 100.0;

        return average;
    }


}
