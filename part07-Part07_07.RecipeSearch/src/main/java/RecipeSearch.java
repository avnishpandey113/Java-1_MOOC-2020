
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        ArrayList<Recipe> recipes = readRecipesFromFile(file);       
        System.out.println("Commands:\n" + "list - lists the recipes\n" + "stop - stops the program\n"
                + "find name - searches recipes by name\n" + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient\n");
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            System.out.println("");
            if (command.equalsIgnoreCase("stop")) {
                break;
            }
            processCommand(command, recipes, scanner);

        }

    }

    public static void processCommand(String command, ArrayList<Recipe> recipes, Scanner input) {
        if (command.equalsIgnoreCase("list")) {
            printRecipes(recipes);
            System.out.println("");
        }
        if (command.equalsIgnoreCase("find name")) {
            findAndPrintRecipesByName(recipes, input);
            System.out.println("");
        }
        if (command.equalsIgnoreCase("find cooking time")) {
            findAndPrintRecipesByCookingTime(recipes, input);
            System.out.println("");
        }
        if (command.equalsIgnoreCase("find ingredient")) {
            findAndPrintRecipesByIngredient(recipes, input);
            System.out.println("");
        }
    }

    public static void printRecipes(ArrayList<Recipe> recipes) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe.toString());
        }
    }

    public static void findAndPrintRecipesByName(ArrayList<Recipe> recipes, Scanner input) {
        System.out.print("Search word: ");
        String word = input.nextLine();
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(word)) {
                System.out.println(recipe.toString());
            }
        }
    }

    public static void findAndPrintRecipesByCookingTime(ArrayList<Recipe> recipes, Scanner input) {
        System.out.print("Max cooking time: ");
        int time = Integer.valueOf(input.nextLine());
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= time) {
                System.out.println(recipe.toString());
            }

        }
    }

    public static void findAndPrintRecipesByIngredient(ArrayList<Recipe> recipes, Scanner input) {
        System.out.print("Ingredient:  ");
        String ingridient = input.nextLine();
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingridient)) {
                System.out.println(recipe.toString());
            }
        }
    }

    public static ArrayList<Recipe> readRecipesFromFile(String filename) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> recipeParts = new ArrayList<>();
        String recipeName;
        int recipeTime;
        try (Scanner fileReader = new Scanner(Paths.get(filename))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (!line.isEmpty()) {
                    recipeParts.add(line);
                } else {
                    recipeName = recipeParts.get(0);
                    recipeTime = Integer.valueOf(recipeParts.get(1));
                    recipeParts.remove(0);
                    recipeParts.remove(0);
                    recipes.add(new Recipe(recipeName, recipeTime, recipeParts));
                    recipeParts.clear();
                }
            }
            if (!recipeParts.isEmpty()) {
                recipeName = recipeParts.get(0);
                recipeTime = Integer.valueOf(recipeParts.get(1));
                recipeParts.remove(0);
                recipeParts.remove(0);
                recipes.add(new Recipe(recipeName, recipeTime, recipeParts));
                recipeParts.clear();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return recipes;

    }

}
