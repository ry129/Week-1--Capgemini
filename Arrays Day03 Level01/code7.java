import java.util.*;
import java.util.Scanner;
class Even_Odd{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int number= sc.nextInt();
		
		if(number<=0){
			System.out.println("Error");
			return;
		}
		 // Create arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        // Index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Loop through numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // Add to even array
            } else {
                oddNumbers[oddIndex++] = i; // Add to odd array
            }
        }

        // Print the odd numbers array
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Print the even numbers array
        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
		