import java.util.Scanner;


public class BMICalculator{
 // Method to calculate BMI for each person and populate the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; // Weight in kg
            double heightInCm = data[i][1]; // Height in cm
            double heightInMeters = heightInCm / 100; // Convert height to meters
            data[i][2] = weight / (heightInMeters * heightInMeters); // Calculate BMI
        }
    }
	
	 // Method to determine the BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// 2D array to store weight, height, and BMI for 10 persons
		double data[][] = new double[10][3];
		
		for(int i=0;i<data.length;i++){
			System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = input.nextDouble(); // Weight
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = input.nextDouble(); // Height
		}
		
		calculateBMI(data);
		
		 // Determine the BMI status for each person
        String[] statuses = determineBMIStatus(data);

        
        System.out.println("\nResults for the team:");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + " | " + data[i][0] + "  |  " + data[i][1] + "  |  " + data[i][2] + "  |  " + statuses[i]);
		}

	}
}