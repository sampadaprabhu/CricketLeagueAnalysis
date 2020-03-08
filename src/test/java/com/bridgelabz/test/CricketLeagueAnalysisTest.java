package com.bridgelabz.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CricketLeagueAnalysisTest {
    private static final String FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH ="./src/test/resources/IPL2019FactsheetMostRuns.csv";

    @Test
    public void givenIPL2019SheetMostRuns_ShouldGetCorrectPlayerNameByAverage() {
        try {
            CricketLeagueAnalysis cricketLeagueAnalysis = new CricketLeagueAnalysis();
            cricketLeagueAnalysis.loadMostRunsData(FACT_SHEET_OF_MOST_RUNS_CSV_FILE_PATH);
            String player=cricketLeagueAnalysis.getSortForAverage();
            //System.out.println("Num of Records Are : "+numOfRecords);
            Assert.assertEquals("MS Dhoni", player);
        } catch (Exception e){}
    }

}
