import java.util.Scanner;

class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store ages and heights of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Array to store the names of the friends
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Take input for the ages and heights of the three friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter height of " + friends[i] + " (in meters): ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest and the tallest
        int youngestIndex = 0;  // Start by assuming Amar is the youngest
        int tallestIndex = 0;   // Start by assuming Amar is the tallest

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;  // Update if a younger friend is found
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;   // Update if a taller friend is found
            }
        }

        // Display the results
        System.out.println("\nThe youngest friend is: " + friends[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is: " + friends[tallestIndex] + " with height " + heights[tallestIndex]);

        scanner.close();
    }
}