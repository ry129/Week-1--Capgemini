import java.util.Scanner;
class Exception{
	public static void generateException(String text){
		for(int i= 0;i<=text.length();i++){
			char ch=text.charAt(i);
		System.out.print(ch);
		}
	}
	public static void handleException(String text){
		
		
         try {
            System.out.println("Attempting to call a method StringIndexOutOfBoundException...");
            Exception.generateException(text); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundException: " + e.getMessage());
            System.out.println("The object 'text' is out of index  and cannot be accessed.");
        }
    }

		
     public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter text");
		String text=sc.nextLine();
		 Exception.handleException(text);
		
		 try {
            generateException(text); // This will throw and stop the program
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception handled in main: " + e.getMessage());
        }

        System.out.println("\nRefactoring to call method with exception handling...");
        // This method handles the exception internally
    }
}
		
		