package com.fictional.school.generators;

public class ClassNameGenerator {

    private static ClassNameGenerator instance;

    private ClassNameGenerator() {
    }

    public static ClassNameGenerator getInstance() {
        if(instance == null) {
            instance = new ClassNameGenerator();
        }

        return instance;
    }

    private static int classCount = 1;

    public String classNameGenerator(int id) {

        if(id <= 5) {
            return id + "° A";
        } else if(id <= 10) {
            return (id - 5) + "° B" ;
        } else {
            long firstDigit = id / 10;
            long lastDigit = id % 10;

            char charValue = 'A';
            int intValue = 0;

            if (lastDigit <= 5 && lastDigit != 0) {
                charValue = (char) (65 + (firstDigit + classCount));
                intValue = (int) lastDigit;

            } else if (lastDigit > 5 ) {
                charValue = (char) (65 + (firstDigit + classCount + 1));
                intValue = (int) lastDigit - 5;

            } else if (lastDigit == 0) {
                charValue = (char) (65 + (firstDigit + classCount));
                intValue = 5;
            }

            if (lastDigit == 0) {
                classCount++;
            }

            id++;

            return intValue + "° " + charValue;
        }
    }
}
