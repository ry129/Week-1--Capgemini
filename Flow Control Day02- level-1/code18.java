import java.util.Scanner;
class Multi{
	public static void main(String[]args){
		//Scanner object
		Scanner sc=new Scanner(System.in);
		//input user
		System.out.println("Enter Number ");
		int number=sc.nextInt();
		for(int i = 6;i<=9;i++){
		int value = i*number;
		System.out.println(number + " * " + i + " = " + value);
		}
	}
}
		
		
			
		
	