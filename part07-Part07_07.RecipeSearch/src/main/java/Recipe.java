
import java.util.ArrayList;

public class Recipe {

    private String name;
    private int time;
    private ArrayList<String> ingredients = new ArrayList<>();

    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        for (String ingredient : ingredients) {
            this.ingredients.add(ingredient);
        }
    }

    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }

    public ArrayList<String> getIngredients() {
        //System.out.println(this.ingredients);
        return this.ingredients;
    }
public void printIngrid() {
    System.out.println(this.ingredients);
}
    @Override
    public String toString() {
        return this.getName() + ", cooking time: " + this.getTime();
    }

}
