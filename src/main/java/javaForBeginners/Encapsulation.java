package javaForBeginners;

public class Encapsulation {

    public static final int LUCKY_NUMBER = 4;
    private String soccerPlayer;

    public String getAvgShotsOnTarget(){
        String avgShots = "This player averages " + calculateAvgShotsOnTarget() + " shots on target each game.";
        return avgShots;
    }

    private int calculateAvgShotsOnTarget(){
        return 8;
    }

    public String getSoccerPlayer() {
        return soccerPlayer;
    }

    public void setSoccerPlayer(String soccerPlayer) {
        this.soccerPlayer = soccerPlayer;
    }
}
