package main.java.com.projeto.projetoHandeball.model.entity;

public class Match {
    int id;
    private String date;
    private Team homeTeam;
    private int homeGoals;
    private Team visitorTeam;
    private int visitorGoals;
    private Stadium stadium;
    private  Boolean over = false;

    public Match(String date, Team homeTeam, Team visitorTeam, Stadium stadium) {
        this.date = date;
        this.homeTeam = homeTeam;
        this.visitorTeam = visitorTeam;
        this.stadium = stadium;
    }
    public Match(int id, String date, Team homeTeam, Team visitorTeam, Stadium stadium) {
        this.id = id;
        this.date = date;
        this.homeTeam = homeTeam;
        this.visitorTeam = visitorTeam;
        this.stadium = stadium;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public Team getVisitorTeam() {
        return visitorTeam;
    }

    public void setVisitorTeam(Team visitorTeam) {
        this.visitorTeam = visitorTeam;
    }

    public int getVisitorGoals() {
        return visitorGoals;
    }

    public void setVisitorGoals(int visitorGoals) {
        this.visitorGoals = visitorGoals;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public Boolean getOver() {
        return over;
    }

    public void setOver(Boolean over) {
        this.over = over;
    }

    public void gameOver(int i, int i1) {
        if(homeGoals>visitorGoals){//caso o time da casa ganha
            this.homeTeam.addPoints(2);
        }
        if(homeGoals<visitorGoals){//caso o time da casa perca
            this.visitorTeam.addPoints(2);
        }if(homeGoals==visitorGoals){//caso empata
            this.visitorTeam.addPoints(1);
            this.homeTeam.addPoints(1);
        }
        this.homeGoals=homeGoals;
        this.visitorGoals=visitorGoals;
        this.homeTeam.addGoals(homeGoals);
        this.visitorTeam.addGoals(visitorGoals);
        this.over=true;
    }
}
