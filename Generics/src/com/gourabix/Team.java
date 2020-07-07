package com.gourabix;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    protected int won;
    protected int lost;
    protected int tied;
    protected int played;
    private List<T> teamPlayers;

    public Team(String name) {
        this.name = name;
        won = 0;
        lost = 0;
        tied = 0;
        played = 0;
        teamPlayers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addTeamPlayer(T teamPlayer) {
        if (teamPlayers.contains(teamPlayer)) {
            System.out.println(teamPlayer.getName() + " is already on the team!");
            return false;
        }

        System.out.println(teamPlayer.getName() + " is now added to " + getName() + ".");
        return teamPlayers.add(teamPlayer);
    }

    public int teamSize() {
        return teamPlayers.size();
    }

    public int getRanking() {
        return (won * 2) + tied;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;

        if (ourScore > theirScore) {
            won++;
            message = " won versus ";
        } else if (ourScore < theirScore) {
            lost++;
            message = " lost to ";
        } else {
            tied++;
            message = " drew with ";
        }

        played++;
        if (opponent != null) {
            System.out.println(getName() + message + opponent.getName() + ".");
            opponent.matchResult(null, theirScore, ourScore);
                                                                    // scores get reversed for the opponent team
                                                                    // null so that an infinite loop doesn't occur
        }
    }

    @Override
    public int compareTo(Team<T> team) {
        // logic for proper tournament table -> More points, the higher up the team in the table
        if (this.getRanking() > team.getRanking()) {
            return -1;
        } else if (this.getRanking() < team.getRanking()) {
            return 1;
        }

        return 0;
    }
}
