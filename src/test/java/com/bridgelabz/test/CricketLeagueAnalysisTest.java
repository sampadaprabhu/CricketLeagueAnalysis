package com.bridgelabz.test;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class CricketLeagueAnalysisTest {
    private static final String FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH = "./src/test/resources/IPL2019FactsheetMostRuns.csv";
    private static final String FACT_SHEET_OF_MOST_WICKETS_CSV_FILE_PATH = "./src/test/resources/IPL2019FactsheetMostWkts.csv";

    //UC1
    @Test
    public void givenIPL2019SheetMostRuns_ShouldGetCorrectPlayerNameByAverage() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadData(CricketLeagueAnalysis.Player.BATSMAN, FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedData(SortedField.average);
            Assert.assertEquals("MS Dhoni", player);
        } catch (IPLCricketLeagueException e) {
            Assert.assertEquals(IPLCricketLeagueException.ExceptionType.NO_PLAYER_FOUND, e.type);
        } catch (Exception e) {
        }
    }

    //UC2
    @Test
    public void givenIPL2019SheetMostStrikingRate_ShouldGetCorrectPlayerByStrikeRate() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadData(CricketLeagueAnalysis.Player.BATSMAN, FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedData(SortedField.strikeRate);
            Assert.assertEquals("Ishant Sharma", player);
        } catch (IPLCricketLeagueException e) {
            Assert.assertEquals(IPLCricketLeagueException.ExceptionType.NO_PLAYER_FOUND, e.type);
        } catch (Exception e) {
        }
    }

    //UC3
    @Test
    public void givenIPL2019SheetMostSheetMost4SAnd6S_ShouldGetCorrectPlayerBy4SAnd6s() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadData(CricketLeagueAnalysis.Player.BATSMAN, FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedData(SortedField.four_six);
            Assert.assertEquals("Andre Russell", player);
        } catch (IPLCricketLeagueException e) {
            Assert.assertEquals(IPLCricketLeagueException.ExceptionType.NO_PLAYER_FOUND, e.type);
        } catch (Exception e) {
        }
    }

    //UC4
    @Test
    public void givenIPL2019SheetMostSheetMost4SAnd6SWithStrikeRate_ShouldGetCorrectPlayer() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadData(CricketLeagueAnalysis.Player.BATSMAN, FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedData(SortedField.four_six, SortedField.strikeRate);
            Assert.assertEquals("Andre Russell", player);
        } catch (IPLCricketLeagueException e) {
            Assert.assertEquals(IPLCricketLeagueException.ExceptionType.NO_PLAYER_FOUND, e.type);
        } catch (Exception e) {
        }
    }

    //UC5
    @Test
    public void givenIPL2019SheetMostAverageWithBestStrikeRate_ShouldGetCorrectPlayer() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadData(CricketLeagueAnalysis.Player.BATSMAN, FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedData(SortedField.strikeRate, SortedField.average);
            Assert.assertEquals("Ishant Sharma", player);
        } catch (IPLCricketLeagueException e) {
            Assert.assertEquals(IPLCricketLeagueException.ExceptionType.NO_PLAYER_FOUND, e.type);
        } catch (Exception e) {
        }
    }

    //UC6
    @Test
    public void givenIPL2019SheetMostRunsWithBestAverage_ShouldGetCorrectPlayer() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadData(CricketLeagueAnalysis.Player.BATSMAN, FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedData(SortedField.average, SortedField.runs);
            Assert.assertEquals("MS Dhoni", player);
        } catch (IPLCricketLeagueException e) {
            Assert.assertEquals(IPLCricketLeagueException.ExceptionType.NO_PLAYER_FOUND, e.type);
        } catch (Exception e) {
        }
    }

    //***********************************BOWLERS*************************************************//

    //UC7
    @Test
    public void givenIPL2019SheetMostBowlingAverage_ShouldGetCorrectPlayer() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadData(CricketLeagueAnalysis.Player.BOWLER, FACT_SHEET_OF_MOST_WICKETS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedData(SortedField.average);
            Assert.assertEquals("Krishnappa Gowtham", player);
        } catch (IPLCricketLeagueException e) {
            Assert.assertEquals(IPLCricketLeagueException.ExceptionType.NO_PLAYER_DATA, e.type);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //UC8
    @Test
    public void givenIPL2019SheetMostStrikingRate_ShouldGetCorrectPlayer() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadData(CricketLeagueAnalysis.Player.BOWLER, FACT_SHEET_OF_MOST_WICKETS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedData(SortedField.strikeRate);
            Assert.assertEquals("Krishnappa Gowtham", player);
        } catch (IPLCricketLeagueException e) {
            Assert.assertEquals(IPLCricketLeagueException.ExceptionType.NO_PLAYER_FOUND, e.type);
        } catch (Exception e) {
        }
    }

    //UC9
    @Test
    public void givenIPL2019SheetMostEconomyRate_ShouldGetCorrectPlayer() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadData(CricketLeagueAnalysis.Player.BOWLER, FACT_SHEET_OF_MOST_WICKETS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedData(SortedField.economy);
            Assert.assertEquals("Ben Cutting", player);
        } catch (IPLCricketLeagueException e) {
            Assert.assertEquals(IPLCricketLeagueException.ExceptionType.NO_PLAYER_FOUND, e.type);
        } catch (Exception e) {
        }
    }

    //UC10
    @Test
    public void givenIPL2019SheetMostBestStrikingRateWith5wAnd4w_ShouldGetCorrectPlayer() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadData(CricketLeagueAnalysis.Player.BOWLER, FACT_SHEET_OF_MOST_WICKETS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedData(SortedField.four_five_Wickets, SortedField.strikeRate);
            Assert.assertEquals("Lasith Malinga", player);
        } catch (IPLCricketLeagueException e) {
            Assert.assertEquals(IPLCricketLeagueException.ExceptionType.NO_PLAYER_FOUND, e.type);
        } catch (Exception e) {
        }
    }

    //UC11
    @Test
    public void givenIPL2019SheetMostBowlingAverageWithBestStrikingRate_ShouldGetCorrectPlayer() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadData(CricketLeagueAnalysis.Player.BOWLER, FACT_SHEET_OF_MOST_WICKETS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedData(SortedField.average, SortedField.strikeRate);
            Assert.assertEquals("Krishnappa Gowtham", player);
        } catch (IPLCricketLeagueException e) {
            Assert.assertEquals(IPLCricketLeagueException.ExceptionType.NO_PLAYER_FOUND, e.type);
        } catch (Exception e) {
        }
    }

    //UC12
    @Test
    public void givenIPL2019SheetMostMaximumWicketsWithBestBowling_ShouldGetCorrectPlayer() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadData(CricketLeagueAnalysis.Player.BOWLER, FACT_SHEET_OF_MOST_WICKETS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedData(SortedField.wickets, SortedField.average);
            Assert.assertEquals("Imran Tahir", player);
        } catch (IPLCricketLeagueException e) {
            Assert.assertEquals(IPLCricketLeagueException.ExceptionType.NO_PLAYER_FOUND, e.type);
        } catch (Exception e) {
        }
    }

    //UC13
    @Test
    public void givenIPL2019SheetMostBattingAndBowlingAverage_ShouldGetCorrectPlayer() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadData(CricketLeagueAnalysis.Player.BATSMAN, FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH);
            cricketLeagueAnalysis.loadData(CricketLeagueAnalysis.Player.BOWLER, FACT_SHEET_OF_MOST_WICKETS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedData(SortedField.Batting_Bowling_Average);
            Assert.assertEquals("Krishnappa Gowtham", player);
        } catch (IPLCricketLeagueException e) {
            Assert.assertEquals(IPLCricketLeagueException.ExceptionType.NO_PLAYER_FOUND, e.type);
        } catch (Exception e) {
        }
    }

    //UC14
    @Test
    public void givenIPL2019SheetAllRounder_ShouldGetCorrectPlayer() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadData(CricketLeagueAnalysis.Player.BATSMAN, FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH);
            cricketLeagueAnalysis.loadData(CricketLeagueAnalysis.Player.BOWLER, FACT_SHEET_OF_MOST_WICKETS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedData(SortedField.All_Rounder);
            Assert.assertEquals("Hardik Pandya", player);
        } catch (IPLCricketLeagueException e) {
            Assert.assertEquals(IPLCricketLeagueException.ExceptionType.NO_PLAYER_FOUND, e.type);
        } catch (Exception e) {
        }
    }
}