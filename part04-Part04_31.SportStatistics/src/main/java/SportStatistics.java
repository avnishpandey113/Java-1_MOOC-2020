
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        ArrayList<Game> games = readRecordsFromFile(file);
        System.out.println("Team: ");
        String team = scan.nextLine();
        int matchesPlayed = 0, wins = 0, losses = 0;
        
        for (Game game : games) {
            if (game.getHomeTeam().equalsIgnoreCase(team) || game.getVisitingTeam().equalsIgnoreCase(team)) {
                matchesPlayed++;
                if (game.getHomeTeam().equalsIgnoreCase(team)) {
                    if (game.getHomeTeamPoints() >= game.getVisitingTeamPoints()) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (game.getVisitingTeam().equalsIgnoreCase(team)) {
                    if (game.getHomeTeamPoints() < game.getVisitingTeamPoints()) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        }
        System.out.println("Games: " + matchesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<Game> readRecordsFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                games.add(new Game(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return games;

    }

}
