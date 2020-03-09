package com.bridgelabz.test;

import org.junit.Assert;
import org.junit.Test;

public class CricketLeagueAnalysisTest {
    private static final String FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH ="./src/test/resources/IPL2019FactsheetMostRuns.csv";

    @Test
    public void givenIPL2019SheetMostRuns_ShouldGetCorrectPlayerNameByAverage() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadMostRunsData(CricketLeagueAnalysis.Player.BATSMAN,FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH);
            String player=cricketLeagueAnalysis.getSortForAverage();
            Assert.assertEquals("MS Dhoni", player);
        } catch (Exception e){}
    }

    @Test
    public void givenIPL2019SheetMostStrikingRate_ShouldGetCorrectPlayerByStrikeRate() {
       try {
           CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
           cricketLeagueAnalysis.loadMostRunsData(CricketLeagueAnalysis.Player.BATSMAN,FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH);
           String player = cricketLeagueAnalysis.getSortForStrikeRate();
           Assert.assertEquals("Ishant Sharma", player);
       } catch (Exception e){}
    }

    @Test
    public void givenIPL2019SheetMostSheetMost4SAnd6S_ShouldGetCorrectPlayerBy4SAnd6s() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis =new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadMostRunsData(CricketLeagueAnalysis.Player.BATSMAN,FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortFor4SAnd6S();
            Assert.assertEquals("Andre Russell",player);
        } catch (Exception e){}
    }

    @Test
    public void givenIPL2019SheetMostSheetMost4SAnd6SWithStrikeRate_ShouldGetCorrectPlayer() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis=new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadMostRunsData(CricketLeagueAnalysis.Player.BATSMAN,FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedFor4SAnd6SWithStrikeRate();
            Assert.assertEquals("Andre Russell",player);
        } catch (Exception e){}
    }

    @Test
    public void givenIPL2019SheetMostAverageWithBestStrikeRate_ShouldGetCorrectPlayer() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis=new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadMostRunsData(CricketLeagueAnalysis.Player.BATSMAN,FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedForAverageWithStrikeRate();
            Assert.assertEquals("Ishant Sharma",player);
        } catch (Exception e){}
    }

    @Test
    public void givenIPL2019SheetMostRunsWithBestAverage_ShouldGetCorrectPlayer() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis=new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadMostRunsData(CricketLeagueAnalysis.Player.BATSMAN,FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH);
            String player = cricketLeagueAnalysis.getSortedForRunsWithBestAverage();
            Assert.assertEquals("David Warner ",player);
        } catch (Exception e){}
    }

}
