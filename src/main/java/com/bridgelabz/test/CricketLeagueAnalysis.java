package com.bridgelabz.test;

import com.bridgelabz.IPLRunsCSV;
import jarpackage.CSVBuilderFactory;
import jarpackage.ICSVBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;

public class CricketLeagueAnalysis {
    List<IPLRunsCSV>iplList= null;
    public void loadMostRunsData(String csvFilePath) {
            try (Reader reader= Files.newBufferedReader(Paths.get(csvFilePath));){
                ICSVBuilder icsvBuilder= CSVBuilderFactory.createBuilder();
                iplList =icsvBuilder.getCSVFileList(reader,IPLRunsCSV.class);
        } catch (IOException e) {
                e.printStackTrace();
            } catch (RuntimeException e){}
    }


    public String getSortForAverage() {
        iplList= (List<IPLRunsCSV>) iplList.stream().sorted(Comparator.comparing(x-> x.average, Comparator.reverseOrder()));  //x=object
        return iplList.get(0).player;
    }
}
