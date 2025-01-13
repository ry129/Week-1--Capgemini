import java.util.Random;

class StudentScore{
    public static void main(String[] args) {
        int numberOfStudents = 5; // Example number of students
        double[][] scores = generateScores(numberOfStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }

    // Method to generate random scores
    public static double[][] generateScores(int numberOfStudents) {
        Random random = new Random();
        double[][] scores = new double[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = 50 + random.nextInt(51); // Physics (50-100)
            scores[i][1] = 50 + random.nextInt(51); // Chemistry (50-100)
            scores[i][2] = 50 + random.nextInt(51); // Math (50-100)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(double[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(double[][] scores, double[][] results) {
        System.out.println("Stud#\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t%.2f\t%.2f\t%.2f\n", 
                (i + 1), scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }
    }
}