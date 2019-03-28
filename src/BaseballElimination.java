import edu.princeton.cs.algs4.In;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BaseballElimination {

    private int[] wins;
    private int[] losses;
    private int[] remaining;
    private int[][] against;
    private Map<String, Integer> teams;
    private int numOfTeams;

    // create a baseball division from given filename in format specified below
    public BaseballElimination(String filename) {
        In in = new In(filename);
        this.numOfTeams = Integer.valueOf(in.readLine());
        this.wins = new int[numOfTeams];
        this.losses = new int[numOfTeams];
        this.remaining = new int[numOfTeams];
        this.against = new int[numOfTeams][numOfTeams];
        this.teams = new HashMap<>();

        for (int i = 0; i < numOfTeams; i++) {
            String teamInfo = in.readLine();
            String[] tmp = teamInfo.split(" +");
            teams.put(tmp[0], i);
            wins[i] = Integer.valueOf(tmp[1]);
            losses[i] = Integer.valueOf(tmp[2]);
            remaining[i] = Integer.valueOf(tmp[3]);
            for (int j = 0; j < numOfTeams ; j++) {
                against[i][j] = Integer.valueOf(tmp[4+j]);
            }
        }
    }

    public int numberOfTeams() {
        return numOfTeams;
    }

    public Iterable<String> teams() {
        return teams.keySet();
    }

    public int wins(String team) {
        Integer teamIndex = teams.get(team);
        if (teamIndex == null) {
            throw new IllegalArgumentException();
        }
        return this.wins[teamIndex];
    }

    public int losses(String team) {
        Integer teamIndex = teams.get(team);
        if (teamIndex == null) {
            throw new IllegalArgumentException();
        }
        return this.losses[teamIndex];
    }

    public int remaining(String team) {
        Integer teamIndex = teams.get(team);
        if (teamIndex == null) {
            throw new IllegalArgumentException();
        }
        return this.remaining[teamIndex];
    }

    public int against(String team1, String team2) {
        Integer team1Index = teams.get(team1);
        Integer team2Index = teams.get(team2);
        if (team1Index == null || team2Index == null) {
            throw new IllegalArgumentException();
        }
        return this.against[team1Index][team2Index];
    }

    // is given team eliminated?
    public boolean isEliminated(String team) {
        Integer teamIndex = teams.get(team);
        if (teamIndex == null) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    // subset R of teams that eliminates given team; null if not eliminated
    public Iterable<String> certificateOfElimination(String team) {
        Integer teamIndex = teams.get(team);
        if (teamIndex == null) {
            throw new IllegalArgumentException();
        }
        return null;
    }

}
