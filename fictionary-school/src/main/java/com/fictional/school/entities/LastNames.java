package com.fictional.school.entities;

import javax.persistence.*;


public class LastNames {
    private String lastName;

    public LastNames(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
