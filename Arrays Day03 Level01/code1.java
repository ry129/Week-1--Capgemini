import java.util.Scanner;

class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare an array to store ages
        int[] age = new int[10];

        // Populate the array with user input
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            age[i] = sc.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < age.length; i++) {
            if (age[i] <= 0) {
                System.out.println("Invalid Age for student " + (i + 1));
            } else if (age[i] >= 18) {
                System.out.println("The student with age " + age[i] + " can vote.");
            } else {
                System.out.println("The student with age " + age[i] + " cannot vote.");
            }
        }
    }
}


		
		