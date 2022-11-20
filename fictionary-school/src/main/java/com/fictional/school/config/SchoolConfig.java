package com.fictional.school.config;

import com.fictional.school.calculator.TotalClassMarksAverageCalculator;
import com.fictional.school.generators.ClassNameGenerator;
import com.fictional.school.service.StudentService;
import com.fictional.school.generators.MarksGenerator;
import com.fictional.school.generators.StudentGenerator;
import com.fictional.school.entities.Marks;
import com.fictional.school.entities.SchoolClass;
import com.fictional.school.entities.Student;
import com.fictional.school.repository.IMarksRepository;
import com.fictional.school.repository.ISchoolClassRepository;
import com.fictional.school.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SchoolConfig {

    @Autowired
    private ISchoolClassRepository scr;

    @Autowired
    private IStudentRepository sr;

    @Autowired
    private IMarksRepository mr;

    //TODO togliere
    @Autowired
    private StudentService ss;

    private final ClassNameGenerator cng = ClassNameGenerator.getInstance();

    private final StudentGenerator sg = StudentGenerator.getInstance();

    private final MarksGenerator mg = MarksGenerator.getInstance();

    private final TotalClassMarksAverageCalculator tcmac = TotalClassMarksAverageCalculator.getInstance();

    @Bean
    CommandLineRunner clr() {
        return args -> {
            for(int k = 1; k <= 25; k++) {
                String className = cng.classNameGenerator(k);

                List<Student> students = new ArrayList<>();

                int randomNumber = (int) (Math.random() * 15) + 15;

                for(int j = 0; j < randomNumber; j++) {
                    List<Marks> marks = new ArrayList<>();

                    for(int i = 0; i < 15; i++) {
                        marks.add(mg.marksGenerator());
                    }

                    mr.saveAll(marks);

                    Student student = sg.generateStudent(marks);
                    student.setStudentClass(className);
                    students.add(student);
                }

                sr.saveAll(students);
                SchoolClass schoolClass = new SchoolClass(students);
                schoolClass.setName(className);
                schoolClass.setClassMarksAverage(tcmac.getClassTotalMarks(students));
                scr.save(schoolClass);
            }

            System.out.println("STUDENTS GENERATED");

        };
    }



}
