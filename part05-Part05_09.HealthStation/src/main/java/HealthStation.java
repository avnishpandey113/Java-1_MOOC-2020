
public class HealthStation {
private int weighingsPerformed;

    public HealthStation() {
        this.weighingsPerformed=0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weighingsPerformed++;
        return person.getWeight();
    }
    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }
    public int weighings() {
        return this.weighingsPerformed;
    }

}
