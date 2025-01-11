import java.util.Scanner;

class operators{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the first number");
	double a=sc.nextDouble();
	
	System.out.println("enter the second number");
	double b=sc.nextDouble();
	
	System.out.println("enter the third number");
	double c=sc.nextDouble();
	
	
	//1st operation
	double q=a + b *c;
	
	//second operation
	double r= a * b + c;
	
	//third operation
	double s=c + a / b;
	
	//fourth operation
	double t=a % b + c;
	
	
	//output
	System.out.println("The results of Int Operations are "+q+", "+r+", "+s+" and "+t);
	
	sc.close();
	
	}
}