package com.fictional.school.generators;

import com.fictional.school.entities.Marks;

import java.util.Random;

public class MarksGenerator {

    private static MarksGenerator instance;

    private MarksGenerator() {

    }

    public static MarksGenerator getInstance() {
        if(instance == null) {
            instance = new MarksGenerator();
        }

        return instance;
    }

    public Marks marksGenerator() {
        String subject = "";

        Random r = new Random();
        int randomSubject = r.nextInt(5) + 1;

        // TODO make marks that go just .0 or .5
        double randomMark = r.nextDouble(10) + 1;

        switch (randomSubject) {
            case 1 -> subject = "Geography";
            case 2 -> subject = "Math";
            case 3 -> subject = "Biology";
            case 4 -> subject = "English";
            case 5 -> subject = "Physics";
        } // END OF SWITCH

        if(randomMark > 10) {
            randomMark = 10;
        } else if(randomMark < 1) {
            randomMark = 1;
        }

        randomMark = (Math.round(randomMark * 2) / 2.0);

        return new Marks(subject, randomMark);
    }
}
