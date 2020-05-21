
import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private GradeStatistics statistics;

    public UserInterface(Scanner reader, GradeStatistics statistics) {
        this.reader = reader;
        this.statistics = statistics;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int point = Integer.valueOf(reader.nextLine());
            if (point == -1) {
                break;
            }
            if (point >= 0 && point <= 100) {
                processMarks(point);
            }
        }
        System.out.println("Point average (all): " + processPointsAverage());

        if (this.statistics.passingPointsAverage() != 0.0) {
            System.out.println("Point average (passing): " + processPassingPointsAverage());
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + processPassPercentage());
        System.out.println("Grade distribution:");
        processPointsToGrade();
    }

    public void processMarks(int point) {
        this.statistics.add(point);
    }

    public double processPointsAverage() {
        return this.statistics.pointsAverage();
    }

    public double processPassingPointsAverage() {
        return this.statistics.passingPointsAverage();
    }

    public double processPassPercentage() {
        return this.statistics.passPercentage();
    }

    public void processPointsToGrade() {
        this.statistics.pointsToGrade();
    }

}
