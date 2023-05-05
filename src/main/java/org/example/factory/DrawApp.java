package org.example.factory;

import org.example.factory.factories.RandomTeamFactory;
import org.example.factory.factories.RandomWeakTeamFactory;
import org.example.factory.factories.TeamSameCountryFactory;
import org.example.factory.interfaces.TeamFactory;
import org.example.factory.model.Team;
import org.example.factory.utils.TeamUtil;

import java.util.List;

public class DrawApp {
    private TeamFactory teamFactory;
    public DrawApp(TeamFactory teamFactory) {
        this.teamFactory = teamFactory;
    }

    public List<?> draw() {
        return this.teamFactory.createTeam();
    }
    public static void main(String[] args) {
        List<Team> teams = TeamUtil.creatSoccerTeams();
        DrawApp randomTeam = new DrawApp(new RandomTeamFactory(teams));
        System.out.println("Team from Random Team Factory"  + randomTeam.draw());

        DrawApp teamSameCountry = new DrawApp(new TeamSameCountryFactory(teams));
        System.out.println("Team from Same Country Team Factory"  + teamSameCountry.draw());

        DrawApp randomWeakTeam = new DrawApp(new RandomWeakTeamFactory(teams));
        System.out.println("Team from Random Weak Factory"  + randomWeakTeam.draw());
    }
}
