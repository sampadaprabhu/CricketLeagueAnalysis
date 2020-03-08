package com.bridgelabz;

public class iplLeagueDTO {
    public String Player;
    public int match;
    public int innings;
    public int runs;
    public double average;
    public double strikeRate;
    public int four;
    public int six;

    public iplLeagueDTO(IPLRunsCSV iplRunsCSV) {
        Player = iplRunsCSV.player;
        match = iplRunsCSV.match;
        innings = iplRunsCSV.innings;
        runs = iplRunsCSV.runs;
        average = iplRunsCSV.average;
        strikeRate = iplRunsCSV.strikeRate;
        four = iplRunsCSV.four;
        six = iplRunsCSV.six;
    }
}
