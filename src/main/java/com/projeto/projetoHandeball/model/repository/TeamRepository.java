package main.java.com.projeto.projetoHandeball.model.repository;

import main.java.com.projeto.projetoHandeball.model.entity.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamRepository {
    List<Team> teams = new ArrayList<>();
    public void save(Team team){
        this.teams.add(team);
    }

    public Team team(String name){
        for (int i = 0; i<this.teams.size(); i++){
            if(teams.get(i).getName().equalsIgnoreCase(name)){
                return teams.get(i);
            }
        }
        return null;
    }

    public List<Team> teams(){
        return this.teams;
    }

    public void remove(String name){
        for (int i = 0; i<this.teams.size(); i++){
            if(teams.get(i).getName().equalsIgnoreCase(name)){
                teams.remove(i);
            }
        }
    }

    public void update(Team team){
        this.teams.remove(team);
        this.save(team);
    }
}
