import java.util.Scanner;


class HandleArrayIndex{


	public static void generateException(int [] array){
	
			int value= array[array.length+6];
		System.out.print(value);
		
	}
	
	
	
	
	public static void handleException(int [] arr){
		
		
         try {
            System.out.println("Attempting to reach index out of Array length: ArrayIndexOutOfBoundException");
            generateException(arr); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught a ArrayIndexOutOfBoundException: " + e.getMessage());
            System.out.println("The Array is out of index  and cannot be accessed.");
        }
    }

		
		
		
     public static void main(String[]args){
		
		int [] arr= {1,5,7,9,78,35};
		
		handleException(arr);
		
		 try {
            generateException(arr); // This will throw and stop the program
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception handled in main: " + e.getMessage());
        }

        System.out.println("\nRefactoring to call method with exception handling...");
        // This method handles the exception internally
    }
}