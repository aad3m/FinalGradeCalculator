import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);

        System.out.print("Current Grade: ");
        double currentGrade = scrn.nextDouble();
        System.out.print("Grade You Want: ");
        double gradeYouWant = scrn.nextDouble();
        System.out.print("Final Exam Weight: ");
        double finalExamWeight = scrn.nextDouble()/100;

        FinalGradeCalculator calculator = new FinalGradeCalculator(currentGrade, gradeYouWant, finalExamWeight);
        double gradeNeeded = calculator.finalGradeNeeded();
        System.out.printf("You need a %.2f%%", gradeNeeded);
        System.out.printf(" to get a %.2f%% overall.", gradeYouWant);


    }
}