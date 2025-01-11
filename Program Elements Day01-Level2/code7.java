import java.util.Scanner;

class swap{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the first number");
	int number1=sc.nextInt();
	
	System.out.println("enter the second number");
	int number2=sc.nextInt();
	
	//swap
	int q=number1;	
	 number1=number2;
	 number2=q;
	
	
	
	//output
	System.out.println("The swapped numbers are "+number1+" and "+number2);
	
	sc.close();
	
	}
}