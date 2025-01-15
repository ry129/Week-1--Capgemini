import java.util.*;
class ExceptionDemo{
	public static void generateException(String text,int start,int end){
		 if (start >= text.length() ||end >= text.length() ) {
            throw new IllegalArgumentException("Index should be smaller than length of string");
        }
		else{
		String str = text.substring(start,end);
		System.out.println(str);
		}
	}
	public static void handleException(String text , int start , int end){
		
		 try {
            System.out.println("Attempting to call a method IllegalArgumentException...");
            generateException(text , start , end); 
        } catch ( IllegalArgumentException e) {
            System.out.println("Caught a IllegalArgumentException: " + e.getMessage());
            System.out.println("The object 'text' argument is illegal  and cannot be accessed.");
        }
		
    }

		
     public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter text");
		String text=sc.nextLine(); 
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		 handleException(text,start,end);//handles exception internally
		
		 try {
            generateException(text,start,end); // This will throw and stop the program
        } catch ( IllegalArgumentException e) {
            System.out.println("Exception handled in main: " + e.getMessage());
        }

        
        
    }
}
		
		