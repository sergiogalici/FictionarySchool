package com.fictional.school.dto;

public class BestPhysicsStudentDTO extends BestStudentParent{

    private String firstName;
    private String lastName;
    private String className;
    private Double physicsMarksAverage;

    public BestPhysicsStudentDTO() {
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

    public Double getPhysicsMarksAverage() {
        return physicsMarksAverage;
    }

    public void setPhysicsMarksAverage(Double physicsMarksAverage) {
        this.physicsMarksAverage = physicsMarksAverage;
    }
}
