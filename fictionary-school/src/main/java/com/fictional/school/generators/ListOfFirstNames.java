package com.fictional.school.generators;

import com.fictional.school.entities.FirstNames;

import java.util.List;

public class ListOfFirstNames {

    public static List<FirstNames> getNames() {
        List<FirstNames> firstNames = List.of(
                new FirstNames("John"),
                new FirstNames("Jessica"),
                new FirstNames("Bob"),
                new FirstNames("Robert"),
                new FirstNames("Elliot"),
                new FirstNames("Julia"),
                new FirstNames("Juliette"),
                new FirstNames("Carlos"),
                new FirstNames("Antonio"),
                new FirstNames("Lucy"),
                new FirstNames("Luca"),
                new FirstNames("Gregor"),
                new FirstNames("Rachele"),
                new FirstNames("Alexsandra"),
                new FirstNames("George"),
                new FirstNames("Gabriela"),
                new FirstNames("Stanley"),
                new FirstNames("Rodrigo"),
                new FirstNames("Diana"),
                new FirstNames("Brad"),
                new FirstNames("David"),
                new FirstNames("Lucian"),
                new FirstNames("Henry"),
                new FirstNames("Carla"),
                new FirstNames("Valeria"),
                new FirstNames("Sergio"),
                new FirstNames("Harrison"),
                new FirstNames("Philip"),
                new FirstNames("Jennifer"),
                new FirstNames("Monica")
        );

        return firstNames;
    }
}
