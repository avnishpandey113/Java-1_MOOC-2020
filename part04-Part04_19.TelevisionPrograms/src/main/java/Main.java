
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String programName = scanner.nextLine();
            if (programName.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int durationOfProgram = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(programName, durationOfProgram));
        }
        System.out.println("");
        System.out.print("Program's maximum duration? ");
        int duration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= duration) {
                System.out.println(program);
            }
        }

    }
}
