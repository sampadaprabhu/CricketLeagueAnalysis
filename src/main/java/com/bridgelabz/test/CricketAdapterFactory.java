package com.bridgelabz.test;

import java.io.IOException;
import java.util.Map;

public class CricketAdapterFactory {

    public static Map<String, iplLeagueDTO> getCricketRelatedData(CricketLeagueAnalysis.Player player, String... csvFilePath) throws IOException {
        if (player.equals(CricketLeagueAnalysis.Player.BATSMAN))
            return new BatsmanAdapter().loadMostRunsData(csvFilePath);
        else if (player.equals(CricketLeagueAnalysis.Player.BOWLER))
            return new BowlerAdapter().loadMostRunsData(csvFilePath);
        else
            throw new IPLCricketLeagueException("Incorrect Player", IPLCricketLeagueException.ExceptionType.INVALID_PLAYER);
    }
}
