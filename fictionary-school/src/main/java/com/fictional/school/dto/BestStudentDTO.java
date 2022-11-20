package com.fictional.school.dto;

public class BestStudentDTO {

    private String firstName;
    private String lastName;
    private String className;
    private Double totalMarksAverage;
    public BestStudentDTO() {
    }

    public BestStudentDTO(String firstName, String lastName, String className, Double totalMarksAverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.className = className;
        this.totalMarksAverage = totalMarksAverage;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Double getTotalMarksAverage() {
        return totalMarksAverage;
    }

    public void setTotalMarksAverage(Double totalMarksAverage) {
        this.totalMarksAverage = totalMarksAverage;
    }
}
