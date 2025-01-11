import java.util.Scanner;

class PersonBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = sc.nextInt();

        // Create a 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        // Input weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            // Take input for height and weight with validation for positive values
            do {
                System.out.print("Height (in meters): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Weight (in kg): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI and store it in the 2D array (BMI = weight / (height * height))
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine the weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and weight status for each person
        System.out.println("\nPerson Details (Height, Weight, BMI, Weight Status):");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("\nPerson %d:\n", (i + 1));
            System.out.printf("Height: %.2f meters\n", personData[i][0]);
            System.out.printf("Weight: %.2f kg\n", personData[i][1]);
            System.out.printf("BMI: %.2f\n", personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }
    }
}
