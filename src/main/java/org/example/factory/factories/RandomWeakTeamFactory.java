package org.example.factory.factories;

import org.example.factory.model.Team;
import org.example.factory.interfaces.TeamFactory;

import java.util.List;

public class RandomWeakTeamFactory implements TeamFactory {

    private List<Team> teams;

    public RandomWeakTeamFactory(List<Team> teams) {
        this.teams = teams;
    }

    @Override
    public List<Team> createTeam() {
        return teams.stream()
                .filter(team -> team.getPerformance() <= 4)
                .toList();
    }
}
