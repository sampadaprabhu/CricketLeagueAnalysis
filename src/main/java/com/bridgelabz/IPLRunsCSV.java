package com.bridgelabz;

import com.opencsv.bean.CsvBindByName;

public class IPLRunsCSV {

    @CsvBindByName(column = "PLAYER", required = true)
    public String player;

    @CsvBindByName(column = "Mat", required = true)
    public int match;

    @CsvBindByName(column = "Inns", required = true)
    public int innings;

    @CsvBindByName(column = "Runs", required = true)
    public int runs;

    @CsvBindByName(column = "Avg", required = true)
    public double average;

    @CsvBindByName(column = "SR", required = true)
    public double strikeRate;

    @CsvBindByName(column = "4s", required = true)
    public int four;

    @CsvBindByName(column = "6s", required = true)
    public int six;

    @Override
    public String toString() {
        return "IPLRunsCSV{" +
                "player='" + player + '\'' +
                ", match=" + match +
                ", innings=" + innings +
                ", runs=" + runs +
                ", average=" + average +
                ", strikeRate=" + strikeRate +
                ", four=" + four +
                ", six=" + six +
                '}';
    }
}
