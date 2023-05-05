package org.example.factory.factories;

import org.example.factory.model.Team;
import org.example.factory.interfaces.TeamFactory;

import java.util.List;
import java.util.Random;

public class RandomTeamFactory implements TeamFactory {

    private List<Team> teams;
    public RandomTeamFactory(List<Team> teams ) {
        this.teams = teams;
    }

    @Override
    public List<Team> createTeam() {
        Random random = new Random();
        List<Integer> list = random.ints(3, 1, 4)
                .boxed()
                .toList();
        System.out.println(list);

        return teams.stream()
                .filter(team -> list.stream()
                        .anyMatch(num -> num == team.getId()))
                .toList();
    }
}
