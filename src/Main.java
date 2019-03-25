public class Main {

    public static void main(String[] args) {
        BaseballElimination be = new BaseballElimination("resources/teams4.txt");
        int i = be.numberOfTeams();
        System.out.println("Number of teams: " + i);
    }
}
