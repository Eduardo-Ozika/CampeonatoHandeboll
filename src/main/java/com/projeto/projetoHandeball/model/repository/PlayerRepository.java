package main.java.com.projeto.projetoHandeball.model.repository;

import main.java.com.projeto.projetoHandeball.model.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepository {
    List<Player> players= new ArrayList<>();
    public void save(Player player){
        this.players.add(player);
    }

    public Player player(String name){
        for (int i=0; i<this.players.size();i++){
            if(players.get(i).getName().equalsIgnoreCase(name)){
                return players.get(i);
            }
        }
        return null;
    }

    public List<Player> players(){
        return this.players;
    }

    public void remove(String name){
        for (int i=0; i<this.players.size();i++){
            if(players.get(i).getName().equalsIgnoreCase(name)){
                players.remove(i);
            }
        }
    }

    public void update(Player player){
        this.players.remove(player);
        this.save(player);
    }
}
