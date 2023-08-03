import java.util.ArrayList;
import java.util.List;

public class FixtureGenerator {
    List<String> teams;
    public FixtureGenerator(List<String> teams) {
        this.teams = new ArrayList<>(teams);
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }
    }

    public List<String> generateFixture() {
        int numTeams = teams.size();
        int numRoads = numTeams - 1;
        int numMatchPerRound = numTeams / 2;

        List<String> fixture = new ArrayList<>();
        for (int round = 0; round < numRoads; round++) {
            for (int match = 0; match < numMatchPerRound; match++) {
                String homeTeam = teams.get(match);
                String awayTeam = teams.get(numMatchPerRound + match);
                String matchInfo = homeTeam + " vs. " + awayTeam;
                fixture.add(matchInfo);
            }
            teams.add(1, teams.remove(teams.size() - 1));
        }
        return fixture;
    }
}
