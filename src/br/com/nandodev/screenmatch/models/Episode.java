package br.com.nandodev.screenmatch.models;

import br.com.nandodev.screenmatch.calculator.Classifiable;

public class Episode implements Classifiable {
    private int number;
    private String name;
    private Series series;
    private int views;

    public Episode (int number, String name, Series series) {
        this.number = number;
        this.name = name;
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public int getViews() {
        return views;
    }

    public String getName() {
        return name;
    }

    public Series getSeries() {
        return series;
    }

    @Override
    public int getClassification() {
        if (getViews() >= 1000) return 5;
        else if (getViews() >= 750) return 4;
        else if (getViews() >= 500) return 3;
        else if (getViews() >= 250) return  2;
        else return 1;
    }
}
