
public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // the aim is to decrement the value of the counter by one
        if (this.value > 0) {
            this.value--;
        }
    }

    public void reset() {
        // reset counter to 0
        this.value = 0;
    }

}
