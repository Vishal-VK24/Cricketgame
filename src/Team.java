import java.util.ArrayList;
import java.util.List;
public class Team {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    private int battercount,bowlercount;
    public List<Player> getBatters() {
        return players;
    }
    public void setBatters(int k) {
        battercount=k;
        for (int i = 0; i < k; i++) {
            batters.add(new Player("Batsman" + i));
        }
       players.addAll(batters);
    }
    public List<Player> getBowlers() {
        return players;
    }

    public void setBowlers(int k) {
        bowlercount=k;
        for(int i=0;i<k;i++){
            bowlers.add(new Player("Bowler"+i));
        }
        players.addAll(bowlers);
    }
    public int teamtotal(){
        int k=0;
        for(Player i:players){
            k+=i.getRunsscored();
        }
        return k;
    }
    public List<Player> getPlayers() {
        return players;
    }
    private List<Player> players= new ArrayList<>();
    private List<Player> batters=new ArrayList<>();
    private List<Player>  bowlers=new ArrayList<>();

}
