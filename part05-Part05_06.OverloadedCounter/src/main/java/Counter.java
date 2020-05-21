
public class Counter {

    private int value;

    public Counter() {
        this(0);
    }

    public Counter(int startValue) {
        this.value = startValue;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value += 1;
    }

    public void decrease() {
        this.value -= 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            this.value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            this.value -= decreaseBy;
        }
    }

}
