package com.github.cricket.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Players")
public class Players {

    @Id
    private long playerId;

    private String playerName;

    private boolean batsman;

    private boolean bowler;

    private boolean allRounder;

    private int matches;

    private int innings;

    private int runs;

    private int highest;

    private double battingAverage;

    private double strikeRate;

    private int centuries;

    private int halfCenturies;

    private int fours;

    private int sixes;

    private double overs;

    private int totalWickets;

    private double bowlingAverage;

    private double bowlingEconomy;

    private double playerPoints;


    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setBatsman(boolean batsman) {
        this.batsman = batsman;
    }

    public void setBowler(boolean bowler) {
        this.bowler = bowler;
    }

    public void setAllRounder(boolean allRounder) {
        this.allRounder = allRounder;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setHighest(int highest) {
        this.highest = highest;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public void setStrikeRate(double strikeRate) {
        this.strikeRate = strikeRate;
    }

    public void setCenturies(int centuries) {
        this.centuries = centuries;
    }

    public void setHalfCenturies(int halfCenturies) {
        this.halfCenturies = halfCenturies;
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    public void setOvers(double overs) {
        this.overs = overs;
    }

    public void setTotalWickets(int totalWickets) {
        this.totalWickets = totalWickets;
    }

    public void setBowlingAverage(double bowlingAverage) {
        this.bowlingAverage = bowlingAverage;
    }

    public void setBowlingEconomy(double bowlingEconomy) {
        this.bowlingEconomy = bowlingEconomy;
    }

    public void setPlayerPoints(double playerPoints) {
        this.playerPoints = playerPoints;
    }

    public long getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public boolean isBatsman() {
        return batsman;
    }

    public boolean isBowler() {
        return bowler;
    }

    public boolean isAllRounder() {
        return allRounder;
    }

    public int getMatches() {
        return matches;
    }

    public int getInnings() {
        return innings;
    }

    public int getRuns() {
        return runs;
    }

    public int getHighest() {
        return highest;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    public int getCenturies() {
        return centuries;
    }

    public int getHalfCenturies() {
        return halfCenturies;
    }

    public int getFours() {
        return fours;
    }

    public int getSixes() {
        return sixes;
    }

    public double getOvers() {
        return overs;
    }

    public int getTotalWickets() {
        return totalWickets;
    }

    public double getBowlingAverage() {
        return bowlingAverage;
    }

    public double getBowlingEconomy() {
        return bowlingEconomy;
    }

    public double getPlayerPoints() {
        return playerPoints;
    }

}
