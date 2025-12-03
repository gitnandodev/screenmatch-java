package br.com.nandodev.screenmatch.filters;

import br.com.nandodev.screenmatch.calculator.Classifiable;

public class ClassificationFilter {
    public void filter (Classifiable classifiable) {
        if (classifiable.getClassification() >= 4) {
            System.out.println("It's among the current favorites!");
        }
        else if (classifiable.getClassification() >= 2) {
            System.out.println("Currently highly rated!");
        }
        else {
            System.out.println("Add it to your watchlist!");
        }
    }
}
