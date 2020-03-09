package com.bridgelabz.test;

import jarpackage.CSVBuilderFactory;
import jarpackage.ICSVBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CricketLeagueAnalysis {

    public enum Player{
        SIX,FOUR,STRIKE_RATE;
    }
    List<IPLRunsCSV>iplList= null;
    Map<String, iplLeagueDTO> iplMap=null;
    public void loadMostRunsData(String csvFilePath) {
            try (Reader reader= Files.newBufferedReader(Paths.get(csvFilePath));){
                ICSVBuilder icsvBuilder= CSVBuilderFactory.createBuilder();
                iplList =icsvBuilder.getCSVFileList(reader,IPLRunsCSV.class);
        } catch (IOException e) {
                e.printStackTrace();
            } catch (RuntimeException e){}
    }

    public String getSortForAverage() {
        return iplList.stream()
                .sorted(Comparator.comparing(x-> x.average, Comparator.reverseOrder())).collect(Collectors.toList()).get(0).player;
    }

     public String getSortForStrikeRate() {
        return iplList.stream().sorted(Comparator.comparing(x-> x.strikeRate,Comparator.reverseOrder())).collect(Collectors.toList()).get(0).player;
    }

}
