import java.util.Scanner;

class SumOfDigits {

   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value for number
      int origNumber = input.nextInt();

      // Define variable number and sum initialized to zero 
      int number = origNumber;
      int sum = 0;
	  int count=0;

      // Run while loop to access each digit of number
      while (number != 0) {
         // Use number % 10 to find each digit of number from last
         int digit = number % 10;

         // add each digit to sum
         sum += digit;
		 count ++;

         // Remove last digit from number essentially get the quotient
         number = number / 10;
      }

      // Print the sum and close the Scanner Stream
	  if(sum%count==0){
		  System.out.println("Harshad Number");
	  }
	  else {
		  System.out.println("Not");
	  }
     // System.out.println("The sum of digit of number:" + origNumber + " = " + sum + " and total digit are " + count);
      input.close();
   }
}