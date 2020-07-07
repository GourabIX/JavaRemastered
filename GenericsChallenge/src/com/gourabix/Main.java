package com.gourabix;

/*
 Create a generic class to implement a league table for a sport.
 The class should allow teams to be added to the list, and store
 a list of teams that belong to the league.

 Your class should have a method to print out the teams in order,
 with the team at the top of the league printed first.

 Only teams of the same type should be added to any particular
 instance of the league class - the program should fail to compile
 if an attempt is made to add an incompatible team.
*/

public class Main {

    public static void main(String[] args) {
        // Create the teams

        Team<Cricket> indianNationalTeam = new Team<>("Indian National Team");
        Team<Cricket> australianNationalTeam = new Team<>("Australian National Team");
        Team<Cricket> nzNationalTeam = new Team<>("New Zealand National Team");

        Team<Football> realMadridClub = new Team<>("Real Madrid F.C.");
        Team<Football> barcelonaClub = new Team<>("Barcelona F.C.");
        Team<Football> arsenalClub = new Team<>("Arsenal F.C.");

        Team<Tennis> chicagoSmash = new Team<>("Chicago Smash");
        Team<Tennis> springfieldLasers = new Team<>("Springfield Lasers");

        // Create the leagues

        League<Cricket> cricketLeague = new League<>("Cricket League");
        League<Football> footballLeague = new League<>("Football League");
        League<Tennis> tennisLeague = new League<>("Tennis League");

        // Add teams to the leagues

        cricketLeague.addTeam(indianNationalTeam);
        cricketLeague.addTeam(australianNationalTeam);
        cricketLeague.addTeam(nzNationalTeam);

        footballLeague.addTeam(realMadridClub);
        footballLeague.addTeam(barcelonaClub);
        footballLeague.addTeam(arsenalClub);

        tennisLeague.addTeam(chicagoSmash);
        tennisLeague.addTeam(springfieldLasers);

        // Play the matches

        indianNationalTeam.matchResult(nzNationalTeam, 251, 276);
        indianNationalTeam.matchResult(nzNationalTeam, 374, 378);
        indianNationalTeam.matchResult(nzNationalTeam, 251, 198);
        indianNationalTeam.matchResult(nzNationalTeam, 251, 252);
        indianNationalTeam.matchResult(nzNationalTeam, 251, 251);

        indianNationalTeam.matchResult(australianNationalTeam, 312, 276);
        indianNationalTeam.matchResult(australianNationalTeam, 354, 232);
        indianNationalTeam.matchResult(australianNationalTeam, 244, 198);
        indianNationalTeam.matchResult(australianNationalTeam, 278, 252);
        indianNationalTeam.matchResult(australianNationalTeam, 334, 337);

        realMadridClub.matchResult(barcelonaClub, 2, 0);
        realMadridClub.matchResult(barcelonaClub, 0, 0);
        realMadridClub.matchResult(barcelonaClub, 0, 3);
        realMadridClub.matchResult(barcelonaClub, 5, 1);
        realMadridClub.matchResult(barcelonaClub, 1, 1);

        realMadridClub.matchResult(arsenalClub, 2, 1);
        realMadridClub.matchResult(arsenalClub, 1, 1);
        realMadridClub.matchResult(arsenalClub, 0, 1);
        realMadridClub.matchResult(arsenalClub, 3, 3);
        realMadridClub.matchResult(arsenalClub, 2, 0);

        chicagoSmash.matchResult(springfieldLasers, 5, 5);
        chicagoSmash.matchResult(springfieldLasers, 6, 5);
        chicagoSmash.matchResult(springfieldLasers, 7, 2);
        chicagoSmash.matchResult(springfieldLasers, 4, 7);
        chicagoSmash.matchResult(springfieldLasers, 1, 1);

        // print the ranking tables

        cricketLeague.printRankingsTable();
        footballLeague.printRankingsTable();
        tennisLeague.printRankingsTable();
    }
}
