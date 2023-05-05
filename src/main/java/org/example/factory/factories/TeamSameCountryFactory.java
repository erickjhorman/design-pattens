package org.example.factory.factories;

import org.example.factory.model.Team;
import org.example.factory.interfaces.TeamFactory;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TeamSameCountryFactory implements TeamFactory {

    private List<Team> teams;

    public TeamSameCountryFactory(List<Team> teams) {
        this.teams = teams;
    }

    @Override
    public List<Team> createTeam() {
        return teams.stream()
                .collect(Collectors.groupingBy(Team::getCountry))
                .values()
                .stream()
                .flatMap(Collection::stream)
                .toList();
    }
}
