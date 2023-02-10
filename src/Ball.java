public class Ball {
    public int getRun() {
        return run;
    }
    public void setRun(int run) {
        this.run = run;
    }
    private int run;
    Ball(){
        this.run=(int)Math.round(7* Math.random());
        if(this.run==7){
            System.out.print("Fall of Wicket ");
            this.run=-1;
        }
    }
}
