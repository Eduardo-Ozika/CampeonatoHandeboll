package main.java.com.projeto.projetoHandeball.model.entity;

public class Captain {
    Player captain;

    public Captain(Player captain) {
        this.captain = captain;
    }

    public Player getCaptain() {
        return captain;
    }

    public void setCaptain(Player captain) {
        this.captain = captain;
    }
}
