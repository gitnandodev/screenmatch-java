package br.com.nandodev.screenmatch.models;

import br.com.nandodev.screenmatch.calculator.Classifiable;

public class Title implements Classifiable {
    private String name;
    private int releaseYear;
    private boolean includedInPlan;
    private double sumOfEvaluations;
    private int totalEvaluations;
    public int durationInMinutes;

    public Title(String name, int releaseYear, int durationInMinutes, boolean includedInPlan) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.durationInMinutes = durationInMinutes;
        this.includedInPlan = includedInPlan;
    }

    public void displayTechnicalSheet() {

    }
    public void rate(double value) {

    }
    public double getAverage() {
        return sumOfEvaluations / totalEvaluations;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getTotalEvaluations() {
        return totalEvaluations;
    }

    @Override
    public int getClassification() {
        if (getAverage() >= 8) return 5;
        else if (getAverage() >= 6) return 4;
        else if (getAverage() >= 4) return 3;
        else if (getAverage() >= 2) return  2;
        else return 1;
    }
}
