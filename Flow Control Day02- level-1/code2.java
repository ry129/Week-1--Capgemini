import java.util.Scanner;
class Smallest{
	public static void main(String[]args){
		//Scanner object
		Scanner sc=new Scanner(System.in);
		//input user
		System.out.println("Enter Number1");
		int num1=sc.nextInt();
		System.out.println("Enter Number2");
		int num2=sc.nextInt();
		System.out.println("Enter Number3");
		int num3=sc.nextInt();
		//conditions to check first number is smallest or not
		if(num1<=num2 && num1<=num3){
			System.out.println(" First Number is Smallest");

		}
		else {
			System.out.println("First number is not smallest");
		}
	}
}
		