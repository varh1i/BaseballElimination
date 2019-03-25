import edu.princeton.cs.algs4.In;

public class BaseballElimination {

    private int[] wins;
    private int[] losses;
    private int[] remaining;
    private int[][] against;
    private String[] teams;
    private int numOfTeams;

    // create a baseball division from given filename in format specified below
    public BaseballElimination(String filename) {
        In in = new In(filename);
        this.numOfTeams = Integer.valueOf(in.readLine());
        for (int i = 0; i < numOfTeams; i++) {
            String teamInfo = in.readLine();
            System.out.println(teamInfo);
        }
    }

    // number of teams
    public int numberOfTeams() {
        return numOfTeams;
    }

    // all teams
    public Iterable<String> teams() {
        return null;
    }

    // number of wins for given team
    public int wins(String team) {
        return 0;
    }

    // number of losses for given team
    public int losses(String team) {
        return 0;
    }

    // number of remaining games for given team
    public int remaining(String team) {
        return 0;
    }

    // number of remaining games between team1 and team2
    public int against(String team1, String team2) {
        return 0;
    }

    // is given team eliminated?
    public boolean isEliminated(String team) {
        return true;
    }

    // subset R of teams that eliminates given team; null if not eliminated
    public Iterable<String> certificateOfElimination(String team) {
        return null;
    }

}
