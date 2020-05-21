
public class Timer {
    private ClockHand hundredthsOfSecond;
    private ClockHand seconds;

    public Timer() {
        this.hundredthsOfSecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    public void advance(){
        this.hundredthsOfSecond.advance();
        if(this.hundredthsOfSecond.value()==0) {
            this.seconds.advance();           
        }
    }
    public String toString() {
        return this.seconds+":"+this.hundredthsOfSecond;
    }
    
    
}
