
public class Main {

    public static void main(String[] args) {
        Menu exactum = new Menu();

        exactum.addMeal("Smoked salmon, white wine and butter sauce with basil");
        exactum.addMeal("Seasonal green salad with apple-honey vinegarette");
        exactum.addMeal("Roasted lamb in a red wine sauce");

        exactum.printMeals();

        exactum.clearMenu();
        exactum.printMeals();
    }
}
