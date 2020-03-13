package com.bridgelabz.test;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CricketLeagueAnalysis {

    public CricketLeagueAnalysis() {
        this.sortedFieldMap = new HashMap<>();

        this.sortedFieldMap.put(SortedField.player, Comparator.comparing(x -> x.Player));
        this.sortedFieldMap.put(SortedField.average, Comparator.comparing(x -> x.batting_average));
        this.sortedFieldMap.put(SortedField.runs, Comparator.comparing(x -> x.runs));
        this.sortedFieldMap.put(SortedField.strikeRate, Comparator.comparing(x -> x.strikeRate));
        this.sortedFieldMap.put(SortedField.four_six, Comparator.comparing(x -> x.four + x.six));
        this.sortedFieldMap.put(SortedField.economy, Comparator.comparing(x -> x.economy));
        this.sortedFieldMap.put(SortedField.four_five_Wickets, Comparator.comparing(x -> x.fourWickets + x.fiveWickets));
        this.sortedFieldMap.put(SortedField.wickets, Comparator.comparing(x -> x.wickets));
        this.sortedFieldMap.put(SortedField.Batting_Bowling_Average, Comparator.comparing(x -> x.batting_average + x.bowling_average));
        this.sortedFieldMap.put(SortedField.All_Rounder, Comparator.comparing(x -> x.runs * x.wickets, Comparator.reverseOrder()));

    }

    public enum Player {
        BATSMAN, BOWLER;
    }

    List<iplLeagueDTO> iplList = null;

    Map<String, iplLeagueDTO> iplMap = null;

    Map<SortedField, Comparator<iplLeagueDTO>> sortedFieldMap = null;

    public void loadData(Player player, String... csvFilePath) throws IOException {
        iplMap = CricketAdapterFactory.getCricketRelatedData(player, csvFilePath);
        iplList = iplMap.values().stream().collect(Collectors.toList());
        // return iplList.get(0).Player;
    }

    public String getSortedData(SortedField... sortedFields) {
        if (iplList.size() == 0 || iplList == null) {
            throw new IPLCricketLeagueException(IPLCricketLeagueException.ExceptionType.NO_PLAYER_DATA);
        } else {
            Comparator<iplLeagueDTO> comparator = sortedFieldMap.get(sortedFields[0]);
            for (int i = sortedFields.length - 2; i >= 0; i--) {
                comparator.thenComparing(sortedFieldMap.get(sortedFields[i]));
            }
            iplList = iplMap.values().stream().sorted(comparator.reversed()).collect(Collectors.toList());
            return iplList.get(0).Player;
        }
    }
}