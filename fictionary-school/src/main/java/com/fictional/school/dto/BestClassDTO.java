package com.fictional.school.dto;

public class BestClassDTO {

    private Long classId;
    private String className;
    private Double classMarksAverage;

    private Integer numberOfStudents;

    public BestClassDTO() {
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Double getClassMarksAverage() {
        return classMarksAverage;
    }

    public void setClassMarksAverage(Double classMarksAverage) {
        this.classMarksAverage = classMarksAverage;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
