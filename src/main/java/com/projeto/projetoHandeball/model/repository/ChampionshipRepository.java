package main.java.com.projeto.projetoHandeball.model.repository;

import main.java.com.projeto.projetoHandeball.model.entity.Championship;

import java.util.ArrayList;
import java.util.List;

public class ChampionshipRepository {
    List<Championship> championships = new ArrayList<>();
    public void save(Championship championship){
        this.championships.add(championship);
    }

    public Championship championship(String name){
        for (int i = 0; i<this.championships.size(); i++){
            if(championships.get(i).getName().equalsIgnoreCase(name)){
                return championships.get(i);
            }
        }
        return null;
    }

    public List<Championship> championships(){
        return this.championships;
    }

    public void remove(String name){
        for (int i = 0; i<this.championships.size(); i++){
            if(championships.get(i).getName().equalsIgnoreCase(name)){
                championships.remove(i);
            }
        }
    }

    public void update(Championship championship){
        this.championships.remove(championship);
        this.save(championship);
    }
}
