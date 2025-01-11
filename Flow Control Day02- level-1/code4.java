import java.util.Scanner;
class Natural{
	public static void main(String[]args){
		//Scanner object
		Scanner sc=new Scanner(System.in);
		//input user
		System.out.println("Enter Number");
		int number=sc.nextInt();
		//conditions to check Natural Number
		if(number<0){
			System.out.println("Number is not a Natural Number");
		}
		else {
			int sum = (number * (number+1) / 2 );
			System.out.println("The Number " + number +  " is Natural Number and its sum is " + sum);
		}
	}
}
		