import java.util.Scanner;

 class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Initialize arrays to store data
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Take input for each student's marks
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            System.out.print("Enter marks in Physics: ");
            physicsMarks[i] = scanner.nextInt();
            while (physicsMarks[i] < 0) {
                System.out.print("Invalid marks. Enter positive value: ");
                physicsMarks[i] = scanner.nextInt();
            }

            System.out.print("Enter marks in Chemistry: ");
            chemistryMarks[i] = scanner.nextInt();
            while (chemistryMarks[i] < 0) {
                System.out.print("Invalid marks. Enter positive value: ");
                chemistryMarks[i] = scanner.nextInt();
            }

            System.out.print("Enter marks in Math: ");
            mathMarks[i] = scanner.nextInt();
            while (mathMarks[i] < 0) {
                System.out.print("Invalid marks. Enter positive value: ");
                mathMarks[i] = scanner.nextInt();
            }

            // Calculate percentage
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathMarks[i]) / 3.0;

            // Determine grade
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display results
        System.out.println("\nResults:");
        System.out.printf("%-10s%-15s%-15s%-15s%-15s%-10s%n", "Student", "Physics", "Chemistry", "Math", "Percentage", "Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d%-15d%-15d%-15d%-15.2f%-10s%n", (i + 1), physicsMarks[i], chemistryMarks[i], mathMarks[i], percentages[i], grades[i]);
        }

        scanner.close();
    }
}