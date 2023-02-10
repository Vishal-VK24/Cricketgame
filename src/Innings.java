import java.util.ArrayList;
import java.util.List;
public class Innings{
     int totalruns;
     int totalwickets;
     List<Over> overs=new ArrayList<>();
    public int getTotalruns() {
        return totalruns;
    }
    public void setTotalruns(int totalruns) {
        this.totalruns = totalruns;
    }

    public int getTotalwickets() {
        return totalwickets;
    }

    public void setTotalwickets(int totalwickets) {
        this.totalwickets = totalwickets;
    }
    public void start(Team team1,Team team2){
        int batterindex=0,bowlerindex=10;
        int i=1;
        List<Ball> temp =new ArrayList<>();
        while(i<=30&&totalwickets<10){
            try {
                Thread.sleep(250);
            }
            catch(InterruptedException e){
                e.getStackTrace();
            }
            Player batter=team1.getPlayers().get(batterindex);
            Player bowler=team2.getPlayers().get(bowlerindex);
            Ball ball = new Ball();
            temp.add(ball);
            if(ball.getRun()!= -1) {
                System.out.println(ball.getRun());
                batter.setRunsscored(ball.getRun());
                batter.setBallsfaced(1);

            }
            else{
                batter.setBallsfaced(1);
                totalwickets++;
                bowler.setWickets(1);
                System.out.format("batsman out %d\n",batter.getRunsscored());
                if(totalwickets==10){
                    System.out.println("All out");
                    Over over= new Over();
                    over.setOver(temp);
                    System.out.format("Over %d details: ",i/6);
                    over.getOver();
                    System.out.println();
                    overs.add(over);
                    temp.removeAll(temp);
                    bowlerindex--;
                    break;
                }
                batterindex++;
            }
            if(i%6==0){
                Over over= new Over();
                over.setOver(temp);
                System.out.format("Over %d details: ",i/6);
                over.getOver();
                System.out.println();
                overs.add(over);
                temp.removeAll(temp);
                bowlerindex--;
            }
            bowler.setBallsbowled(1);
            i++;
        }
        totalruns= team1.teamtotal();
    }
    public void start(Team team1,Team team2,boolean chase){
        int batterindex=0,bowlerindex=10;
        int i=1;
        List<Ball> temp =new ArrayList<>();
        while(i<=30&&totalwickets<10){
            try {
                Thread.sleep(250);
            }
            catch(InterruptedException e){
                e.getStackTrace();
            }
            Player batter=team1.getPlayers().get(batterindex);
            Player bowler=team2.getPlayers().get(bowlerindex);
            Ball ball = new Ball();
            temp.add(ball);
            if(ball.getRun()!= -1) {
                System.out.println(ball.getRun());
                batter.setRunsscored(ball.getRun());
                batter.setBallsfaced(1);
                if(team1.teamtotal()>team2.teamtotal()){
                    System.out.println(team1.getName() + " Won the match");
                    break;
                }
            }
            else{
                totalwickets++;
                bowler.setWickets(1);
                System.out.format("batsman out %d\n",batter.getRunsscored());
                if(totalwickets==10){
                    System.out.println("All out");
                    Over over= new Over();
                    over.setOver(temp);
                    System.out.format("Over %d details: ",i/6);
                    over.getOver();
                    System.out.println();
                    overs.add(over);
                    temp.removeAll(temp);
                    break;
                }
                batterindex++;
            }
            if(i%6==0){
                Over over= new Over();
                over.setOver(temp);
                System.out.format("Over %d details: ",i/6);
                over.getOver();
                System.out.println();
                overs.add(over);
                temp.removeAll(temp);
                bowlerindex--;
            }
            bowler.setBallsbowled(1);
            i++;
        }
        totalruns= team1.teamtotal();
        if(team1.teamtotal()<team2.teamtotal()){
            System.out.println(team2.getName() + " Won the match");
        }
    }
}
