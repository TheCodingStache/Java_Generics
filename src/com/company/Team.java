package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String message;
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tie = 0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + "is already in the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + "picked for that team");
            return true;
        }

    }

    public int numPlayer() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (theirScore == ourScore) {
            message = " tie ";
            tie++;
        } else {
            message = " lost ";
            lost++;
        }
        if (opponent != null) {
            System.out.println(getName() + message + opponent.getName());
            opponent.matchResult(null, ourScore, theirScore);
        }

    }

    public int Ranking() {
        return (won * 2) + tie;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.Ranking() <= team.Ranking()) {
            return -1;
        } else if (team.Ranking() <= this.Ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
