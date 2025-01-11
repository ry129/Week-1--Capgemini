import java.util.Scanner;
class Compare{
	public static void main(String[]args){
		//Scanner object
		Scanner sc=new Scanner(System.in);
		//input user
		System.out.println("Enter Number ");
		int number=sc.nextInt();
		int fact=1;
		if(number>0)
			System.out.println("Number is Natural");
		for(int i=1;i<number;i++){
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
		
		