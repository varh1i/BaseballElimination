public class Main {

    public static void main(String[] args) {
        BaseballElimination be = new BaseballElimination("resources/teams4.txt");
        for (String team : be.teams()) {
            System.out.print(team + " " + be.wins(team) + " " + be.losses(team) + " " + be.remaining(team));
            for (String teamAgainst : be.teams()) {
                System.out.print(" " + be.against(team, teamAgainst));
            }
            System.out.println();
        }

    }
}
