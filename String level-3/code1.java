import java.util.Scanner;
public class BMI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        
        // Taking input for height and weight
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        
        // Call method to calculate BMI and Status
        String[][] results = calculateBMI(data);
        
        // Display results
        displayResults(results);
        sc.close();
    }

    // Method to calculate BMI and Status
    public static String[][] calculateBMI(double[][] data) {
        String[][] results = new String[10][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightMeters = data[i][1] / 100.0;
            double bmi = weight / (heightMeters * heightMeters);
            results[i][0] = String.format("%.2f", weight);
            results[i][1] = String.format("%.2f", heightMeters);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = getStatus(bmi);
        }
        return results;
    }

    // Method to get BMI Status
    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi >= 18.5 && bmi < 24.9) return "Normal weight";
        else if (bmi >= 25 && bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    // Method to display results in tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }
}
