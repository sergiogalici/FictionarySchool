package com.fictional.school.controller;

import com.fictional.school.dto.BestClassDTO;
import com.fictional.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/school/best/classes")
public class BestClassesInSchool {

    @Autowired
    private SchoolService ss;

    @GetMapping
    public List<BestClassDTO> getBestClasses() {
        return ss.getBestClasses();
    }
}
