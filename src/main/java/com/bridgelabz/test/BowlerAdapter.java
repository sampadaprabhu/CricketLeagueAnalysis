package com.bridgelabz.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BowlerAdapter extends CricketLeagueAdapter {
    @Override
    public Map<String, iplLeagueDTO> loadMostRunsData(String... csvFilePath) throws IOException {
        Map<String, iplLeagueDTO> iplMap=new HashMap<>();
        iplMap=super.loadMostRunsData(IPLWicketsCSV.class,csvFilePath[0]);
            return iplMap;
    }
}
