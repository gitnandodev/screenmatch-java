package br.com.nandodev.screenmatch.models;

public class Movie extends Title{
    private String director;

    public Movie(String name, int releaseYear, int durationInMinutes, boolean includedInPlan) {
        super(name, releaseYear, durationInMinutes, includedInPlan);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
