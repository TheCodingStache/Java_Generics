package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer Jim = new FootballPlayer("Jim ");
        FootballPlayer Vassilis = new FootballPlayer("Vassilis ");
        FootballPlayer Dave = new FootballPlayer("Dave");
        BaseballPlayer Nick = new BaseballPlayer("Nick");
        FootballPlayer George = new FootballPlayer("George");
        FootballPlayer Chris = new FootballPlayer("Chris ");

        Team<FootballPlayer> olumpiakos = new Team<>("Olympiakos");
        olumpiakos.addPlayer(Jim);
        olumpiakos.addPlayer(Vassilis);
        System.out.println(olumpiakos.numPlayer());

        Team<FootballPlayer> arsenal = new Team<>("Arsenal");
        arsenal.addPlayer(Dave);
        arsenal.addPlayer(Dave);

        Team<FootballPlayer> manchester = new Team<>("Manchester");

        olumpiakos.matchResult(arsenal,6,0);
        olumpiakos.matchResult(manchester,5,1);
        manchester.matchResult(olumpiakos,1,1);
        olumpiakos.matchResult(manchester,5,1);

        System.out.println(olumpiakos.getName() +" has " + olumpiakos.Ranking() + " points");
        System.out.println(arsenal.getName() +" has " + arsenal.Ranking() + " points");
        System.out.println(manchester.getName() + " has " + manchester.Ranking() + " points");

        System.out.println(olumpiakos.compareTo(arsenal));

    }
}
