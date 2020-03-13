package com.bridgelabz.test;

public class iplLeagueDTO {
    public String Player;
    public int match;
    public int innings;
    public int runs;
    public double average;
    public double batting_average;
    public double strikeRate;
    public int four;
    public int six;
    public int wickets;
    public int fourWickets;
    public int fiveWickets;
    public double economy;
    public double bowling_average;

    public iplLeagueDTO(IPLRunsCSV iplRunsCSV) {
        Player = iplRunsCSV.player;
        match = iplRunsCSV.match;
        innings = iplRunsCSV.innings;
        runs = iplRunsCSV.runs;
        average = iplRunsCSV.average;
        batting_average = iplRunsCSV.average;
        strikeRate = iplRunsCSV.strikeRate;
        four = iplRunsCSV.four;
        six = iplRunsCSV.six;
    }

    public iplLeagueDTO(IPLWicketsCSV iplWicketsCSV) {
        Player = iplWicketsCSV.player;
        match = iplWicketsCSV.match;
        innings = iplWicketsCSV.innings;
        runs = iplWicketsCSV.runs;
        average = iplWicketsCSV.average;
        bowling_average = iplWicketsCSV.average;
        strikeRate = iplWicketsCSV.strikeRate;
        wickets = iplWicketsCSV.wickets;
        fourWickets = iplWicketsCSV.fourWickets;
        fiveWickets = iplWicketsCSV.fiveWickets;
        economy = iplWicketsCSV.economy;
    }
}
