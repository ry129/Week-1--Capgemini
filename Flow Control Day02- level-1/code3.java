import java.util.Scanner;
class Largest{
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
		//conditions to check largest of three
		if(num1>=num2 && num1>=num3){
			System.out.println(" First Number is Largest");
			}
		else if (num2>=num1 && num2>=num3) {
			System.out.println("Second number is Largest");
		}
		else {
			System.out.println("Third Number is Largest");
		}
	}
}