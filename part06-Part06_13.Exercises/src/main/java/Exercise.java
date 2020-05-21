
public class Exercise {

    private String name;
    private boolean completed;

    public Exercise(String exerciseName) {
        this.name = exerciseName;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }
}
