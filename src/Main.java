import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Team1");
        teams.add("Team2");
        teams.add("Team3");
        teams.add("Team4");

        FixtureGenerator fixtureGenerator = new FixtureGenerator(teams);
        List<String> fixture = fixtureGenerator.generateFixture();

        for (String matchInfo : fixture) {
            System.out.println(matchInfo);
        }
    }
}
