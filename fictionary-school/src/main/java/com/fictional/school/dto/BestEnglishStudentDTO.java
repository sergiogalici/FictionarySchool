package com.fictional.school.dto;

public class BestEnglishStudentDTO extends BestStudentParent{

    private String firstName;
    private String lastName;
    private String className;
    private Double englishMarksAverage;

    public BestEnglishStudentDTO() {
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

    public Double getEnglishMarksAverage() {
        return englishMarksAverage;
    }

    public void setEnglishMarksAverage(Double englishMarksAverage) {
        this.englishMarksAverage = englishMarksAverage;
    }
}
