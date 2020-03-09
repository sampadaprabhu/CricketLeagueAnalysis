package com.bridgelabz.test;

public class iplLeagueDTO {
    public String Player;
    public int match;
    public int innings;
    public int runs;
    public double average;
    public double strikeRate;
    public int four;
    public int six;
    public int wickets;
    public int fourWickets;
    public int fiveWickets;

    public iplLeagueDTO(IPLRunsCSV iplCSV) {
        Player = iplCSV.player;
        match = iplCSV.match;
        innings = iplCSV.innings;
        runs = iplCSV.runs;
        average = iplCSV.average;
        strikeRate = iplCSV.strikeRate;
        four = iplCSV.four;
        six = iplCSV.six;
    }

}
