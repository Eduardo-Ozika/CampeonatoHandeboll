package main.java.com.projeto.projetoHandeball.model.entity;

public class Player implements Comparable<Player>{
    private String name;
    private String birthDate;
    private char gender;
    private Double height;

    public Player(String name, String birthDate, char gender, Double height) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public int compareTo(Player player2) {
        return this.name.compareTo(player2.getName());
    }
    @Override
    public String toString(){return("Jogador: "+ this.name+" "+this.birthDate+" "+this.gender+" "+this.height);}
}
