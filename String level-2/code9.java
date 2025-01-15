import java.util.Random;
public class Grades {
    // Method to generate random marks for Physics, Chemistry, and Maths
    public static int[][] generateMarks(int students) {
        Random random = new Random();
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            marks[i][0] = random.nextInt(100); // Physics
            marks[i][1] = random.nextInt(100); // Chemistry
            marks[i][2] = random.nextInt(100); // Maths
        }
        return marks;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculatePerformance(int[][] marks) {
        double[][] result = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to assign grades based on percentage
    public static char[] assignGrades(double[][] performance) {
        char[] grades = new char[performance.length];
        for (int i = 0; i < performance.length; i++) {
            double percentage = performance[i][2];
            if (percentage >= 90) {
                grades[i] = 'A';
            } else if (percentage >= 75) {
                grades[i] = 'B';
            } else if (percentage >= 50) {
                grades[i] = 'C';
            } else {
                grades[i] = 'D';
            }
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] marks, double[][] performance, char[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            marks[i][0] + "\t" +
                            marks[i][1] + "\t\t" +
                            marks[i][2] + "\t" +
                            (int) performance[i][0] + "\t" +
                            performance[i][1] + "\t" +
                            performance[i][2] + "%\t" +
                            grades[i]);
        }
    }

    public static void main(String[] args) {
        int[][] marks = generateMarks(5);

        double[][] performance = calculatePerformance(marks);

        char[] grades = assignGrades(performance);

        displayScorecard(marks, performance, grades);
    }
}
