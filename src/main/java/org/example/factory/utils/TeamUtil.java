package org.example.factory.utils;

import org.example.factory.model.Team;

import java.util.List;

public class TeamUtil {

    public static List<Team> creatSoccerTeams() {
       return List.of(new Team(1, "Real madrid", "Spain", 10),
                new Team(2, "Bayer munich", "Germany", 9),
                new Team(3, "Manchester city", "England", 10),
                new Team(4, "Gigon", "Spain", 3),
                new Team(5, "Chelsea", "England", 4),
                new Team(6, "Roma", "Italian", 2));
    }
}
