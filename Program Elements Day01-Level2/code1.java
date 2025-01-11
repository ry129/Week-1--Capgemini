import java.util.Scanner;

class numbers{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the first number");
	int number1=sc.nextInt();
	
	System.out.println("enter the second number");
	int number2=sc.nextInt();
	
	//quotient
	int q=number1/number2;
	
	//remainder
	int r=number1%number2;
	
	
	//output
	System.out.println("The Quotient is "+q+" and Reminder is "+r+" of two number "+number1+" and "+number2);
	
	sc.close();
	
	}
}