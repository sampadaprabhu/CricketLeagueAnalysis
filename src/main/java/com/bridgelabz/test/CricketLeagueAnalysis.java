package com.bridgelabz.test;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CricketLeagueAnalysis {

    public CricketLeagueAnalysis() {
       this.sortedFieldMap= new HashMap<>();

       this.sortedFieldMap.put(SortedField.player,Comparator.comparing(x->x.Player));
       this.sortedFieldMap.put(SortedField.average,Comparator.comparing(x->x.average));
       this.sortedFieldMap.put(SortedField.runs,Comparator.comparing(x->x.runs));
       this.sortedFieldMap.put(SortedField.strikeRate,Comparator.comparing(x->x.strikeRate));
       this.sortedFieldMap.put(SortedField.four,Comparator.comparing(x->x.four));
       this.sortedFieldMap.put(SortedField.six,Comparator.comparing(x->x.six));
    }

    public enum Player{
        BATSMAN,BOWLER;
    }
    List<iplLeagueDTO>iplList= null;

    Map<String, iplLeagueDTO> iplMap=null;

    Map<SortedField,Comparator<iplLeagueDTO>> sortedFieldMap = null;
    public String loadMostRunsData(Player player, String ...csvFilePath) throws IOException {

        iplMap = CricketAdapterFactory.getCricketRelatedData(player,csvFilePath);
        iplList=iplMap.values().stream().collect(Collectors.toList());
        return iplList.get(0).Player;
    }

    public String loadMostWicketsData(Player player, String ...csvFilePath) throws IOException {
        iplMap=CricketAdapterFactory.getCricketRelatedData(player,csvFilePath);
        iplList=iplMap.values().stream().collect(Collectors.toList());
        return iplList.get(0).Player;
    }


    public String getSortForAverage() {
        iplList=iplMap.values().stream().sorted(Comparator.comparing(x-> x.average, Comparator.reverseOrder())).collect(Collectors.toList());
        return iplList.get(0).Player;
    }

     public String getSortForStrikeRate() {
        iplList=iplMap.values().stream().sorted(Comparator.comparing(x-> x.strikeRate,Comparator.reverseOrder())).collect(Collectors.toList());
        return iplList.get(0).Player;
    }

    public String getSortFor4SAnd6S(){
        iplList=iplMap.values().stream().sorted(Comparator.comparing(x->x.four + x.six,Comparator.reverseOrder())).collect(Collectors.toList());
        return iplList.get(0).Player;
    }

    public String getSortedFor4SAnd6SWithStrikeRate() {
        Comparator<iplLeagueDTO> comparator=Comparator.comparing(x->x.four+ x.six);
        comparator.thenComparing(x->x.strikeRate);
        iplList=iplMap.values().stream().sorted(comparator.reversed()).collect(Collectors.toList());
        return iplList.get(0).Player;
    }

    public String getSortedForAverageWithStrikeRate() {
        Comparator<iplLeagueDTO> comparator=Comparator.comparing(x->x.strikeRate);
        comparator.thenComparing(x->x.average);
        iplList=iplMap.values().stream().sorted(comparator.reversed()).collect(Collectors.toList());
        return iplList.get(0).Player;
    }

    public String getSortedForRunsWithBestAverage() {
        Comparator<iplLeagueDTO> comparator=Comparator.comparing(x->x.runs);
        comparator.thenComparing(x->x.average);
        iplList=iplMap.values().stream().sorted(comparator.reversed()).collect(Collectors.toList());
        return iplList.get(0).Player;
    }

    public String getSortForEconomyRate() {
        iplList=iplMap.values().stream().sorted(Comparator.comparing(x-> x.economy,Comparator.reverseOrder())).collect(Collectors.toList());
        return iplList.get(0).Player;

    }

}
