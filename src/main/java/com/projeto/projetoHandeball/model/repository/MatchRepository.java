package main.java.com.projeto.projetoHandeball.model.repository;

import main.java.com.projeto.projetoHandeball.model.entity.Match;

import java.util.ArrayList;
import java.util.List;

public class MatchRepository {
    List<Match> matches = new ArrayList<>();
    public void save(Match match){
        this.matches.add(match);
    }

    public Match math(int id){
        for (int i = 0; i<this.matches.size(); i++){
            if(matches.get(i).getId()==id){
                return matches.get(i);
            }
        }
        return null;
    }

    public List<Match> matches(){
        return this.matches;
    }

    public void remove(int id){
        for (int i = 0; i<this.matches.size(); i++){
            if(matches.get(i).getId()==id){
                matches.remove(i);
            }
        }
    }

    public void update(Match match){
        this.matches.remove(match);
        this.save(match);
    }
}
