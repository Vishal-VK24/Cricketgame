public class CricketgameMain {
    public static void main(String[] args) {
        //Cricket game : 5 overs match
        Gamemanager game = new Gamemanager();
        Team team1 = new Team();
        Team team2 = new Team();
        team1.setName("CSK");
        team2.setName("MI");
        game.setTeam1(team1);
        game.setTeam2(team2);
        game.setTosswinner(game.tossevent(team1,team2));
        team1.setBatters(6);
        team1.setBowlers(5);
        team2.setBatters(5);
        team2.setBowlers(6);
        game.match(team1,team2);

        game.scorecard(team1,team2);
    }
}