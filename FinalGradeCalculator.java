public class FinalGradeCalculator {

    private double currentGrade;
    private double gradeYouWant;
    private double finalExamWeight;

    // Constructor
    public FinalGradeCalculator(double currentGrade, double gradeYouWant, double finalExamWeight) {
        this.currentGrade = currentGrade;
        this.gradeYouWant = gradeYouWant;
        this.finalExamWeight = finalExamWeight;
    }

    // Method to calculate the final grade needed on the exam
    public double finalGradeNeeded() {
        double currentWeight = 1.0 - finalExamWeight;
        double targetWeight = finalExamWeight;
        double gradeNeeded = (gradeYouWant - (currentGrade * currentWeight)) / targetWeight;
        return gradeNeeded;
    }
}

