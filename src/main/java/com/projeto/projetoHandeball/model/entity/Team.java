package main.java.com.projeto.projetoHandeball.model.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team implements Comparable<Team>{
    private String name;
    private List<Player> players = new ArrayList<>();
    private Captain captain;
    private Stadium homeStadium;
    private int points;
    private int goals;

    public Team(String name, Captain captain, Stadium homeStadium) {
        this.name = name;
        this.captain = captain;
        this.homeStadium = homeStadium;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Captain getCaptain() {
        return captain;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }

    public Stadium getStadium() {
        return homeStadium;
    }

    public void setStadium(Stadium Stadium) {
        this.homeStadium = Stadium;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    public void addPoints(int points){
        this.points += points;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public void addGoals(int goals) {
        this.goals += goals;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String name) {
        for (int i=0; i<this.players.size();i++){
            if(players.get(i).getName().equalsIgnoreCase(name)){
                players.remove(i);
            }
        }
    }
    public void removePlayer(Player player) {
        this.players.remove(player);
    }
    public void listPlayers(){
        Collections.sort(this.players);
        System.out.println("Nome | Data de Nascimento | Genero | Altura");
        for (Player p: this.players) {
            System.out.println(p.toString());
        }
        System.out.println("Capitão: "+captain.getCaptain().getName());
    }

    @Override
    public int compareTo(Team team) {
        if(team.getPoints()==this.points)
            return (team.getGoals()-this.goals);
        return (team.getPoints()-this.points);
    }
}
