import java.util.List;

public class Gamemanager extends Toss{
    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Innings getInnings1() {
        return innings1;
    }
    public void setInnings1(Innings innings1) {
        this.innings1 = innings1;
    }

    public Innings getInnings2() {
        return innings2;
    }

    public void setInnings2(Innings innings2) {
        this.innings2 = innings2;
    }
    public String getTosswinner() {
        return tosswinner;
    }

    public void setTosswinner(String tosswinner) {
        this.tosswinner = tosswinner;
        this.tossdecision = getDecision();

    }
    public String getTossdecision() {
        return tossdecision;
    }
    public void match(Team team1,Team team2){
        this.innings1= new Innings();
        this.innings2= new Innings();
        setInnings1(innings1);
        setInnings2(innings2);
        int i=setThings();
        if(i==1) {
            innings1.start(team1, team2);
            System.out.println("Total "+ team1.getName()+" "+innings1.getTotalruns()+"-"+innings1.getTotalwickets()+"\n\n\n\n\n");
            innings2.start(team2, team1, true);
            System.out.println("Total "+ team2.getName()+" "+innings2.getTotalruns()+"-"+innings2.getTotalwickets()+"\n\n\n\n\n");
            System.out.println("Total "+ team1.getName()+" "+innings1.getTotalruns()+"-"+innings1.getTotalwickets());
            System.out.println("Total "+ team2.getName()+" "+innings2.getTotalruns()+"-"+innings2.getTotalwickets());
        }
        else {
            innings1.start(team2, team1);
            System.out.println("Total "+ team2.getName()+" "+innings1.getTotalruns()+"-"+innings1.getTotalwickets()+"\n\n\n\n\n");
            innings2.start(team1, team2, true);
            System.out.println("Total "+ team1.getName()+" "+innings2.getTotalruns()+"-"+innings2.getTotalwickets()+"\n\n\n\n\n");
            System.out.println("Total "+ team2.getName()+" "+innings1.getTotalruns()+"-"+innings1.getTotalwickets());
            System.out.println("Total "+ team1.getName()+" "+innings2.getTotalruns()+"-"+innings2.getTotalwickets());
        }
    }
    public int setThings(){
        System.out.println(getWinner()+" "+getDecision());
        if(getWinner().equals("Team 1")){
            if(getDecision().equals("1")) {
                return 1;
            }
            else {
                return 2;
            }
        }
        else{
            if(getDecision().equals("1")) {
                return 2;
            }
            else {
                return 1;
            }
        }
    }
    public void scorecard(Team team1,Team team2){
        System.out.println("Team1 score card");
        System.out.println("name  runs  balls  wickets  overs");
        for(Player i: team1.getPlayers()){

            System.out.println(i.getName()+" \t"+i.getRunsscored()+" "+i.getBallsfaced()+" "+i.getWickets()+" "+" "+i.getBallsbowled()/6);
        }
        System.out.println("Team2 score card");
        System.out.println("name  runs  balls  wickets  overs");
        for(Player i:team2.getPlayers()){

            System.out.println(i.getName()+" \t"+i.getRunsscored()+" "+i.getBallsfaced()+" "+i.getWickets()+" "+" "+i.getBallsbowled()/6);
        }
    }
    private Team team1,team2;
    private Innings innings1,innings2;
    private String tosswinner;
    private String tossdecision;
}

