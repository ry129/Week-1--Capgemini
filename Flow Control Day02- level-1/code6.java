import java.util.Scanner;
class NumberCheck{
	public static void main(String[]args){
		//Scanner object
		Scanner sc=new Scanner(System.in);
		//input user
		System.out.println("Enter Number");
		int number=sc.nextInt();
		//condition to check whether the number is positive zero or negative
		if(number == 0 ){
			System.out.println("Enter Number" + number + " is zero");
		} else if(number >0){
			System.out.println("Enter Number " + number + " is positive");
		}
		else{System.out.println("Enter Number " + number + " is negative");
		}
	}
}
		