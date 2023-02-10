import java.util.List;
import java.util.Set;

public class Over {
    public void getOver() {
        for(Ball i: over){
            if(i.getRun()==-1)
                System.out.print("W ");
            else
                System.out.print(i.getRun()+" ");
        }
    }

    public void setOver(List<Ball> over) {
        this.over = over;
    }
    private List<Ball> over;
}
