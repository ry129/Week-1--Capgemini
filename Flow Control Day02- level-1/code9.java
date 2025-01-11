import java.util.Scanner;
class Counter{
	public static void main(String[]args){
		//Scanner object
		Scanner sc=new Scanner(System.in);
		//input user
		System.out.println("Enter Number");
		int number=sc.nextInt();
		//check the counter is 1 or decrenment it by printing its value
		for(int i=number ; i>=1;i--){
			System.out.println(i);
			
		}
}}