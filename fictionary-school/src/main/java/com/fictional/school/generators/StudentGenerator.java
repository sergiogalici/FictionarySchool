package com.fictional.school.generators;

import com.fictional.school.entities.FirstNames;
import com.fictional.school.entities.LastNames;
import com.fictional.school.entities.Marks;
import com.fictional.school.entities.Student;


import java.util.List;
import java.util.Random;

public class StudentGenerator {

    private static StudentGenerator instance;

    private StudentGenerator() {

    }

    public static StudentGenerator getInstance() {
        if(instance == null) {
            instance = new StudentGenerator();
        }

        return instance;
    }

    private MarksGenerator mg = MarksGenerator.getInstance();

    public Student generateStudent(List<Marks> passedMarks) {
        List<FirstNames> firstNames = ListOfFirstNames.getNames();
        List<LastNames> lastNames = ListOfLastNames.getNames();

        Random rand = new Random();

        String firstName = firstNames.get(rand.nextInt(firstNames.size())).getFirstName();
        String lastName = lastNames.get(rand.nextInt(lastNames.size())).getLastName();


        return new Student(firstName, lastName, passedMarks);
    }
}
