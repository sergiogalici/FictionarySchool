package com.fictional.school.comparator;

import com.fictional.school.entities.Student;

import java.util.Comparator;

public class StudentsMarksComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return a.getTotalMarksAverage().compareTo(b.getTotalMarksAverage());
    }
}
