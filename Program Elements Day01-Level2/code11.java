import java.util.Scanner;

class simpleInterest{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the principal");
	int a=sc.nextInt();
	
	System.out.println("enter the rate");
	int b=sc.nextInt();
	
	System.out.println("enter the time");
	int c=sc.nextInt();
	
	
	//simple interest
	double si=(double)(a*b*c)/100;
	
	
	
	//output
	System.out.println("The Simple Interest is "+si+" for Principal "+a+", "+" Rate of Interest "+b+" and Time "+c);

	
	sc.close();
	
	}
}