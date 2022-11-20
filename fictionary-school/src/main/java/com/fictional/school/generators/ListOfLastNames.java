package com.fictional.school.generators;

import com.fictional.school.entities.LastNames;

import java.util.List;

public class ListOfLastNames {

    public static List<LastNames> getNames() {
        List<LastNames> lastNames = List.of(
                new LastNames("Conrad"),
                new LastNames("Rossi"),
                new LastNames("Smith"),
                new LastNames("Pitt"),
                new LastNames("Richardson"),
                new LastNames("Doe"),
                new LastNames("Desmond"),
                new LastNames("Hancock"),
                new LastNames("Denaro"),
                new LastNames("Davis"),
                new LastNames("Di Caprio"),
                new LastNames("Aniston"),
                new LastNames("Simpson"),
                new LastNames("Rebillet"),
                new LastNames("Monk"),
                new LastNames("Harrings"),
                new LastNames("Kubrick"),
                new LastNames("Rodriguez"),
                new LastNames("Cooper"),
                new LastNames("Brubeck"),
                new LastNames("Woolf"),
                new LastNames("Coetzee"),
                new LastNames("Willard"),
                new LastNames("Del Toro"),
                new LastNames("Cole"),
                new LastNames("Galici"),
                new LastNames("De Marco"),
                new LastNames("Cohen"),
                new LastNames("Kahlo"),
                new LastNames("La Monica")
        );

        return lastNames;
    }
}
