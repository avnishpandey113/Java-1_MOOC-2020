
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String read = fileReader.nextLine();
                if(read.contains(searchedFor)) {
                    System.out.println("Found!");
                    return;
                }
            }
            System.out.println("Not found");
            
        } catch (Exception e) {
            System.out.println("Reading the file "+file+" failed.");
        }

    }
}
