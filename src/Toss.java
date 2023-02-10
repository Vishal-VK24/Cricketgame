import java.util.Scanner;

public class Toss{
    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    private int choice;
    private String winner;

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    private String decision;
    public String tossevent(Team team1,Team team2){
        System.out.format("Toss %s calls (0-Heads 1-Tails): \n",team1.getName());

        Scanner scanner= new Scanner(System.in);
        this.choice= scanner.nextInt();
        int guess=(int)Math.round(Math.random());
        if(this.choice==guess){
            System.out.format("%s wins toss (bowling-0 or batting-1)? \n",team1.getName());
            this.decision= scanner.next();
            this.winner="Team 1";
        }
        else{
            System.out.format("%s wins toss (bowling-0 or batting-1)? \n",team2.getName());
            this.decision=scanner.next();
            this.winner="Team 2";
        }
        return this.winner;
    }

}
