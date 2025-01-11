import java.util.Scanner;

class CountDigits {

   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value for number
	  System.out.println("Enter Number");
      int count = input.nextInt();
	  int n=count;
	  int sum = 0;

      // Run while loop to access each digit of number
      while (count != 0) {
         // Use number % 10 to find each digit of number from last
        sum++;
		 count = count/10;
		
		  }
    if(n==0){
		System.out.println("1"); 
	}
	else {
	System.out.println("The count of digit of number:" +sum);
	}
      
      
      input.close();
   }
}