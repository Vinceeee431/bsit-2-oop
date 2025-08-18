public class Main {
    public static void main(String[] args) {
        GradeCalculator gc = new GradeCalculator();

        String student = "John Smith";
        double average = gc.calculateAverage(85.5, 92.0, 78.5, 90.0);
        String letterGrade = gc.getLetterGrade(average);

        // First method call
        gc.displayResult(student, average);

        // Second method call (with grade)
        gc.displayResult(student, average, letterGrade);
    }
}
