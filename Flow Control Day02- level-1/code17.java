import java.util.Scanner;
class Salary{
	public static void main(String[]args){
		//Scanner object
		Scanner sc=new Scanner(System.in);
		//input user
		System.out.println("Enter salary ");
		int salary=sc.nextInt();
		System.out.println("Years of Service");
		int years=sc.nextInt();
		int bonus;
		if(years >=5) {
		 bonus = (salary*5/100); 
		System.out.println("The bonus amount is " + bonus); 
		}
	}
}
		
	