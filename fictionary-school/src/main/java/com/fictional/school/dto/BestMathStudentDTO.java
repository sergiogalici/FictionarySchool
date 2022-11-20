package com.fictional.school.dto;

public class BestMathStudentDTO extends BestStudentParent {

    private String firstName;
    private String lastName;
    private String className;
    private Double mathMarksAverage;
    public BestMathStudentDTO() {
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

    public Double getMathMarksAverage() {
        return mathMarksAverage;
    }

    public void setMathMarksAverage(Double mathMarksAverage) {
        this.mathMarksAverage = mathMarksAverage;
    }
}
