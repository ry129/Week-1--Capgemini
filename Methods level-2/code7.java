 import java.util.Scanner;

 class StudentVoteChecker {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            // Negative age is invalid
            return false;
        }
        // Return true if age is 18 or above, else false
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] studentAges = new int[10];

        // Create an object of StudentVoteChecker
        StudentVoteChecker voteChecker = new StudentVoteChecker();

        // Loop to take input for ages and display voting eligibility
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();

            // Check if the student can vote
            boolean canVote = voteChecker.canStudentVote(studentAges[i]);

            // Display the result
            if (studentAges[i] < 0) {
                System.out.println("Invalid age entered. Cannot vote.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        scanner.close();
    }
}
