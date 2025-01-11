import java.util.Scanner;

class height{
   public static void main(String[] args){
   
      Scanner sc=new Scanner(System.in);
	  //take height as input in cm
	  double h=sc.nextDouble();
	  
	  //convert into inch 1 inch=2.54cm
	  double inch=h/2.54;
	  
	  //convert into feet 1 foot=12 inches
	  double feet=inch/12;
	  
	 
	  
	  //the desired output
	 System.out.println("Your Height in cm is "+ h+" while in feet is "+ feet +" and inches is "+ inch);
	 
	 sc.close();
	 
   }
}