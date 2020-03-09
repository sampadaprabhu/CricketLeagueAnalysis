package com.bridgelabz.test;

import jarpackage.CSVBuilderFactory;
import jarpackage.ICSVBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.StreamSupport;

public abstract class CricketLeagueAdapter {
    public abstract <E> Map<String, iplLeagueDTO> loadMostRunsData(String... csvFilePath) throws IOException;

    public <E> Map<String, iplLeagueDTO> loadMostRunsData(Class<E> className,String csvFilePath) throws IOException {
        Map<String,iplLeagueDTO> iplMap=new HashMap<>();
        try (Reader reader= Files.newBufferedReader(Paths.get(csvFilePath))){
            ICSVBuilder csvBuilder= CSVBuilderFactory.createBuilder();
            Iterator<E> cricketer=csvBuilder.getCSVFileIterator(reader,className);
            Iterable<E> criceterIterable=()->cricketer;

            if (className.getName().equals("com.bridgelabz.test.IPLRunsCSV")){
                StreamSupport.stream(criceterIterable.spliterator(),false)
                        .map(IPLRunsCSV.class::cast)
                        .forEach(batsman-> iplMap.put(batsman.player,new iplLeagueDTO(batsman)));
            }
           else if (className.getName().equals("com.bridgelabz.test.IPLWicketsCSV")){
                StreamSupport.stream(criceterIterable.spliterator(),false)
                        .map(IPLWicketsCSV.class::cast)
                        .forEach(bowlers-> iplMap.put(bowlers.player,new iplLeagueDTO(bowlers)));
            }
            return iplMap;
        }

    }
}
