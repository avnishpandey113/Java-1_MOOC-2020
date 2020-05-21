
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object person) {
        if (this == person) {
            return true;
        }
        
        if (!(person instanceof Person)) {
            return false;
        }
        Person personCompared = (Person) person;

        if (this.birthday.equals(personCompared.birthday)&& 
                this.name.equals(personCompared.name) && 
                this.height == personCompared.height && 
                this.weight == personCompared.weight) {
            return true;
        }

        return false;
    }
}
