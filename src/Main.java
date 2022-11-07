import main.java.com.projeto.projetoHandeball.model.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Championship> c = new ArrayList<>();
    public static void main(String[] args) {
        //Criando um campeoanato
        Championship championship = new Championship("CMHM");
        c.add(championship);
        //Criando Jogadores e Captao do time do Flamengo
        Captain player1 = new Captain(new Player("João","03/05/2002",'M',1.85));
        Player player2 = new Player("Eduardo","15/03/2002",'M',1.80);
        Player player3 = new Player("Miguel","20/08/2000",'M',1.75);
        Player player4 = new Player("Fernando","03/05/2002",'M',1.65);
        Player player5 = new Player("Jeam","03/05/2002",'M',1.90);
        Player player6 = new Player("Sara","03/05/2002",'F',1.95);
        Player player7 = new Player("Sophia","03/05/2002",'M',2.00);
        Player player8 = new Player("Ana Luiza","03/05/2002",'M',1.5);
        //Criando Estadio da equipe do flamengo
        Stadium stadium = new Stadium("Nilton", null);
        championship.addStadium(stadium);
        //Criando o time da equipe do Flamengo
        Team team = new Team("Flamengo",player1,stadium);
        //Adicionando os jogadores no time do Flamengo
        team.addPlayer(player1.getCaptain());
        team.addPlayer(player2);
        team.addPlayer(player3);
        team.addPlayer(player4);
        team.addPlayer(player5);
        team.addPlayer(player6);
        team.addPlayer(player7);
        team.addPlayer(player8);
        championship.addTeam(team);
        //listando Jogadores
        team.listPlayers();
        System.out.println();
        //criando jogadores do time do Coritians
        Captain player9 = new Captain(new Player("Touko","03/05/2002",'M',1.85));
        Player player10 = new Player("Assedo","15/03/2002",'M',1.80);
        Player player11 = new Player("Ciun","20/08/2000",'M',1.75);
        Player player12 = new Player("Voryu","03/05/2002",'M',1.65);
        Player player13 = new Player("Calas","03/05/2002",'M',1.90);
        Player player14 = new Player("Gilur","03/05/2002",'F',1.95);
        Player player15 = new Player("Kiuxo","03/05/2002",'M',2.00);
        Player player16 = new Player("Deoru","03/05/2002",'M',1.5);
        //Criando Estadio da equipe do Coritians
        Stadium stadium2 = new Stadium("CalvisBravos", null);
        championship.addStadium(stadium2);
        //Criando o time da equipe do Coritians
        Team team2 = new Team("Coritians",player9,stadium2);
        //Adicionando os jogadores no time do Coritians
        team2.addPlayer(player9.getCaptain());
        team2.addPlayer(player10);
        team2.addPlayer(player11);
        team2.addPlayer(player12);
        team2.addPlayer(player13);
        team2.addPlayer(player14);
        team2.addPlayer(player15);
        team2.addPlayer(player16);
        team2.removePlayer(player12);
        championship.addTeam(team2);
        //listando Jogadores
        team2.listPlayers();
        System.out.println();
        //Criando duas partidas
        Match match = new Match("25/12/2021",team,team2,team.getStadium());
        Match match2 = new Match("30/12/2021",team2,team,team2.getStadium());
        //adicionando lista de partidas na championsship;
        championship.addMatch(match);
        championship.addMatch(match2);
        //listando as partidas
        championship.listMatches();
        System.out.println();
        //finalizando  uma partida
        match.gameOver(62,54);
        //listando as partidas
        championship.listMatches();
        System.out.println();
        System.out.println();
        //listando a tabela do campeonato
        championship.tableChampionship();
        System.out.println();
        //listando todos os jogadores
        System.out.println("listando todos os jogadores");
        championship.listPlayers();
        //buscar time
        System.out.println();
        System.out.println("Buscar Time");
        Team t = championship.searchTeam("flamengo");
        System.out.println(t.getName());
        //buscar jogador
        System.out.println();
        System.out.println("buscar jogador");
        Player p = championship.searchPlayer("Eduardo");
        System.out.println(p.toString());
        //buscar Estadio
        System.out.println();
        System.out.println("buscar Estadio");
        Stadium s = championship.searchStadium("Calvisbravos");
        System.out.println(s.getName());
        //buscar Campeonato
        System.out.println();
        System.out.println("buscar Campeonato");
        championship = searchChampionship("cmhm");
        System.out.println(championship.getName());
    }

    private static Championship searchChampionship(String name) {
        for (Championship cham: c) {
            if(cham.getName().equalsIgnoreCase(name))
                return cham;
        }
        return null;
    }
}