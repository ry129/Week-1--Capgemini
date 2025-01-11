import java.util.Scanner;
class EnterZero{
	public static void main(String[]args){
		//Scanner object
		Scanner sc=new Scanner(System.in);
		//input user
		System.out.println("Enter Number ");
		double number=sc.nextDouble();
		double total = 0.0;
		while(true){
			if(number<=0){
				break;
			}
			total+=number;
		number=sc.nextDouble();
		}
	System.out.println("Total value " + total);
	}
}