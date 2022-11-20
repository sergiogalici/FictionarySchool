package com.fictional.school.entities;

import javax.persistence.*;

public class FirstNames {
    private String firstName;

    public FirstNames(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
