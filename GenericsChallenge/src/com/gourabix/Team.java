package com.gourabix;

public class Team<T extends Sport> implements Comparable<Team<T>> {
    private String name;
    protected int won;
    protected int lost;
    protected int tied;
    protected int played;

    public Team(String name) {
        this.name = name;
        won = 0;
        lost = 0;
        tied = 0;
        played = 0;
    }

    public String getName() {
        return name;
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
            System.out.println(getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.getRanking() > team.getRanking()) {
            return -1;
        } else if (this.getRanking() < team.getRanking()) {
            return 1;
        }

        return 0;
    }
}
