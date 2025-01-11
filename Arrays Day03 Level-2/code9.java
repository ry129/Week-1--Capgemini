import java.util.Scanner;

 class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        // Create a 2D array to store marks of students in Physics, Chemistry, and Maths
        int[][] marks = new int[students][3];

        // Take input for marks of each student
        System.out.println("Enter the marks of each student in Physics, Chemistry, and Maths:");
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                if (j == 0) System.out.print("Physics: ");
                if (j == 1) System.out.print("Chemistry: ");
                if (j == 2) System.out.print("Maths: ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Array to store percentages and grades
        double[] percentages = new double[students];
        char[] grades = new char[students];

        // Calculate percentage and grade for each student
        for (int i = 0; i < students; i++) {
            int total = 0;

            // Calculate total marks
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            // Calculate percentage
            percentages[i] = (total / 3.0);

            // Assign grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 75) {
                grades[i] = 'B';
            } else if (percentages[i] >= 50) {
                grades[i] = 'C';
            } else {
                grades[i] = 'F';
            }
        }

        // Display results
        System.out.println("\nResults:");
        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%, Grade: %c\n", percentages[i], grades[i]);
        }
    }
}
