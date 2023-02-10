import java.util.List;

public class Player {
    Player(String name){
        this.name=name;
    }
    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets++;
    }
    public int getRunsscored() {
        return runsscored;
    }

    public void setRunsscored(int runsscored) {
        this.runsscored+= runsscored;
    }

    public int getBallsfaced() {
        return ballsfaced;
    }

    public void setBallsfaced(int ballsfaced) {
        this.ballsfaced +=ballsfaced;
    }
    public int getBallsbowled() {
        return ballsbowled;
    }

    public void setBallsbowled(int ballsbowled) {
        this.ballsbowled++;
    }

    public int getRunsgiven() {
        return runsgiven;
    }

    public void setRunsgiven(int runsgiven) {
        this.runsgiven = runsgiven;
    }
    private int wickets,ballsbowled,runsgiven;
    private int runsscored;
    private int ballsfaced;
    private String name;

    public String getName() {
        return name;
    }
}
