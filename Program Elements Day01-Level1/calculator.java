import java.util.Scanner;

class calculator{
   public static void main(String[] args){
   
      Scanner sc=new Scanner(System.in);
	  
	  //take first number as input
	  System.out.println("enter the first number");
	  float number1=sc.nextFloat();
	  
	 //take second number as input
	  System.out.println("enter the second number");
	  float number2=sc.nextFloat();
	  
	  // addition
	  float sum=number1+number2;
	  
	  //subtraction
	  float diff=number1-number2;
	  
	  //multiplication
	  float multiply=number1*number2;
	  
	  //division
	  float div=number1/number2;
	 
	  
	  //the desired output
	 System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ number1 +" and "+ number2+ 
	 " is "+ sum+", "+diff+", "+multiply+", "+" and "+div);
	 
	 sc.close();
	 
   }
}