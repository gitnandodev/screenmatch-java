package br.com.nandodev.screenmatch.models;

public class Series extends Title{
    private int seasons;
    private int epForEachSeason;
    private boolean active;
    private int minutesForEachEp;

    public Series(String name, int releaseYear, int durationInMinutes, boolean includedInPlan) {
        super(name, releaseYear, durationInMinutes, includedInPlan);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpForEachSeason(int epForEachSeason) {
        this.epForEachSeason = epForEachSeason;
    }

    public void setMinutesForEachEp(int minutesForEachEp) {
        this.minutesForEachEp = minutesForEachEp;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpForEachSeason() {
        return epForEachSeason;
    }

    public boolean isActive() {
        return active;
    }

    public int getMinutesForEachEp() {
        return minutesForEachEp;
    }

    @Override
    public int getDurationInMinutes() {
        return minutesForEachEp * epForEachSeason * seasons;
    }
}
