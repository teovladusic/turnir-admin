package com.example.turniradmin;

public class GameEvent {
    private String scorerID;
    private String event;   //goal, card..
    private String team;

    public GameEvent() {
    }

    public GameEvent(String scorerID, String event, String team) {
        this.scorerID = scorerID;
        this.event = event;
        this.team = team;
    }

    public String getScorerID() {
        return scorerID;
    }

    public void setScorerID(String scorerID) {
        this.scorerID = scorerID;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}