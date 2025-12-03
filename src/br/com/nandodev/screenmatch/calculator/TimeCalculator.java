package br.com.nandodev.screenmatch.calculator;

import br.com.nandodev.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime = 0;

    public int getTotalTime() {
        return totalTime;
    }

    public void includes(Title t) {
        this.totalTime += t.getDurationInMinutes();
    }
}
