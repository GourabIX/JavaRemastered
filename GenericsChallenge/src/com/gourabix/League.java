package com.gourabix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Sport> {
    private String name;
    private List<Team<T>> leagueTeams;

    public League(String name) {
        this.name = name;
        leagueTeams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private List<Team<T>> sortTeamByRanking() {
        Collections.sort(leagueTeams);
        return leagueTeams;
    }

    public void printRankingsTable() {
        List<Team<T>> sortedRankings = sortTeamByRanking();
        int i = 1;
        System.out.println("\n-------------------------- Rankings -> " + getName() + " ----------------------------");
        for (Team<T> team : sortedRankings) {
            System.out.println(i + ". " + team.getName() + " :: Points = " + team.getRanking());
            i++;
        }
        System.out.println("----------------------------------------------------------------------------------");
    }

    public void addTeam(Team<T> team) {
        if (leagueTeams.contains(team)) {
            System.out.println(team.getName() + " is already participating in the league.");
            return;
        }

        leagueTeams.add(team);
        System.out.println(team.getName() + " was successfully added to the " + getName());
    }
}
