package com.fictional.school.service;

import com.fictional.school.dto.BestClassDTO;
import com.fictional.school.entities.SchoolClass;
import com.fictional.school.repository.ISchoolClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private ISchoolClassRepository scr;

    public List<BestClassDTO> getBestClasses() {
        List<SchoolClass> bestClasses = scr.findAllByOrderByClassMarksAverageDesc();
        List<BestClassDTO> classesToReturn = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            SchoolClass currentClass = bestClasses.get(i);

            BestClassDTO classToAdd = new BestClassDTO();
            classToAdd.setClassId(currentClass.getId());
            classToAdd.setClassName(currentClass.getName());
            classToAdd.setNumberOfStudents(currentClass.getTotalStudents());
            classToAdd.setClassMarksAverage(currentClass.getClassMarksAverage());

            classesToReturn.add(classToAdd);
        }

        return classesToReturn;
    }
}
