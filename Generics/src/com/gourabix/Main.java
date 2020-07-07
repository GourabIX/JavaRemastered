package com.gourabix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FootballPlayer messi = new FootballPlayer("Lionel Messi");
        CricketPlayer kohli = new CricketPlayer("Virat Kohli");
        EsportsPlayer gourab = new EsportsPlayer("Gourab Sarkar");

        Team<FootballPlayer> footballTeam = new Team<>("Argentina National");
        Team<CricketPlayer> indiaCricketTeam = new Team<>("Indian National Team");
        Team<EsportsPlayer> blueTeam = new Team<>("Indian Blues");

        footballTeam.addTeamPlayer(messi);
        indiaCricketTeam.addTeamPlayer(kohli);
        blueTeam.addTeamPlayer(gourab);

        indiaCricketTeam.addTeamPlayer(new CricketPlayer("M.S. Dhoni"));
        indiaCricketTeam.addTeamPlayer(new CricketPlayer("Rohit Sharma"));
        indiaCricketTeam.addTeamPlayer(new CricketPlayer("Jasprit Bumrah"));

        Team<CricketPlayer> australiaCricketTeam = new Team<>("Australian National Team");
        australiaCricketTeam.addTeamPlayer(new CricketPlayer("Steve Smith"));
        australiaCricketTeam.addTeamPlayer(new CricketPlayer("David Warner"));
        australiaCricketTeam.addTeamPlayer(new CricketPlayer("Aaron Finch"));
        australiaCricketTeam.addTeamPlayer(new CricketPlayer("Glenn Maxwell"));

        Team<CricketPlayer> nzCricketTeam = new Team<>("New Zealand National Team");
        nzCricketTeam.addTeamPlayer(new CricketPlayer("Kane Williamson"));
        nzCricketTeam.addTeamPlayer(new CricketPlayer("Ross Taylor"));
        nzCricketTeam.addTeamPlayer(new CricketPlayer("Martin Guptill"));
        nzCricketTeam.addTeamPlayer(new CricketPlayer("Trent Boult"));

        System.out.println(indiaCricketTeam.getName() + " has " + indiaCricketTeam.teamSize() + " players.");
        System.out.println(australiaCricketTeam.getName() + " has " + australiaCricketTeam.teamSize() + " players.");
        System.out.println(nzCricketTeam.getName() + " has " + nzCricketTeam.teamSize() + " players.");
        System.out.println(footballTeam.getName() + " has " + footballTeam.teamSize() + " players.");
        System.out.println(blueTeam.getName() + " has " + blueTeam.teamSize() + " players.");

        indiaCricketTeam.matchResult(nzCricketTeam, 251, 276);
        indiaCricketTeam.matchResult(nzCricketTeam, 374, 378);
        indiaCricketTeam.matchResult(nzCricketTeam, 251, 198);
        indiaCricketTeam.matchResult(nzCricketTeam, 251, 252);
        indiaCricketTeam.matchResult(nzCricketTeam, 251, 251);

        indiaCricketTeam.matchResult(australiaCricketTeam, 312, 276);
        indiaCricketTeam.matchResult(australiaCricketTeam, 354, 232);
        indiaCricketTeam.matchResult(australiaCricketTeam, 244, 198);
        indiaCricketTeam.matchResult(australiaCricketTeam, 278, 252);
        indiaCricketTeam.matchResult(australiaCricketTeam, 334, 337);

        List<Team<CricketPlayer>> tournamentTable = new ArrayList<>();
        tournamentTable.add(indiaCricketTeam);
        tournamentTable.add(australiaCricketTeam);
        tournamentTable.add(nzCricketTeam);
        Collections.sort(tournamentTable);              // we can use static methods in the Collections class
                                                        // because the Team<T> class implements Comparable<Team<T>>

        System.out.println();
        System.out.println("---------------- RANKINGS TABLE ----------------");
        System.out.println("Total matches played: " + indiaCricketTeam.played + ".");
        System.out.println("Total points played for: " + indiaCricketTeam.played * 2 + ".");
        System.out.println("Total matches tied: " + (int) (indiaCricketTeam.tied + nzCricketTeam.tied +
                australiaCricketTeam.tied) + ".");
        System.out.println();
        for (Team<CricketPlayer> team: tournamentTable) {
            System.out.println(team.getName() + ": " + team.getRanking());
        }
        System.out.println("------------------------------------------------");
    }
}
