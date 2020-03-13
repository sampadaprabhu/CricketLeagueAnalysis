package com.bridgelabz.test;

public class IPLCricketLeagueException extends RuntimeException {

    public enum ExceptionType {
        NO_PLAYER_DATA,
        INVALID_PLAYER;
    }

    public ExceptionType type;

    public IPLCricketLeagueException(ExceptionType type) {
        this.type = type;
    }

    public IPLCricketLeagueException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}