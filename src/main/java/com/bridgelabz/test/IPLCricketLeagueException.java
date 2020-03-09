package com.bridgelabz.test;

public class IPLCricketLeagueException extends RuntimeException{

    public enum ExceptionType{
        NO_CENSUS_DATA;
    }
    public ExceptionType type;

    public IPLCricketLeagueException(String message, String name){
        super(name);
        this.type=ExceptionType.valueOf(name);
    }

    public IPLCricketLeagueException(ExceptionType type) {
        this.type = type;
    }

    public IPLCricketLeagueException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}