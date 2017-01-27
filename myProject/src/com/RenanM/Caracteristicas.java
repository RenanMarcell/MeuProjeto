package com.RenanM;

import java.util.Date;

/**
 * Created by Marcel on 1/25/2017.
 */
public class Caracteristicas {
    private final Date date;
    private final Double open;
    private final Double high;
    private final Double low;
    private final Double close;
    private final Double volume;
    private final Double adjClose;

    public Caracteristicas(Date date, Double open, Double high, Double low, Double close, Double volume, Double adjClose) {
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        this.adjClose = adjClose;
    }

    @Override
    public String toString() {
        return "Data: " + date + "\n" +
                "Open: " + open + "\n" +
                "High: " + high + "\n" +
                "Low: " + low + "\n" +
                "Close: " + close + "\n" +
                "Volume: " + volume + "\n" +
                "Adj Close: " + adjClose + "\n";
    }

    public Date getDate() {
        return date;
    }

    public Double getOpen() {
        return open;
    }

    public Double getHigh() {
        return high;
    }

    public Double getLow() {
        return low;
    }

    public Double getClose() {
        return close;
    }

    public Double getVolume() {
        return volume;
    }

    public Double getAdjClose() {
        return adjClose;
    }
}
