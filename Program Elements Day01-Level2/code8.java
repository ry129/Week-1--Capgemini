import java.util.Scanner;

class operator{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the first number");
	int a=sc.nextInt();
	
	System.out.println("enter the second number");
	int b=sc.nextInt();
	
	System.out.println("enter the third number");
	int c=sc.nextInt();
	
	
	//1st operation
	int q=a + b *c;
	
	//second operation
	int r= a * b + c;
	
	//third operation
	int s=c + a / b;
	
	//fourth operation
	int t=a % b + c;
	
	
	//output
	System.out.println("The results of Int Operations are "+q+", "+r+", "+s+" and "+t);
	
	sc.close();
	
	}
}