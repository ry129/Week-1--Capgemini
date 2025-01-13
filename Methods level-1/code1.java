import java.util.Scanner;
class Method{
	public void simpleInterest(int principal,int rate,int time){
		System.out.println(principal*rate*time/100);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pricipal :");
		int principal=sc.nextInt();
		System.out.println("Enter Rate :");
		int rate=sc.nextInt();
		System.out.println("Enter Time :");
		int time=sc.nextInt();
		//
		Method obj=new Method();
		obj.simpleInterest(principal,rate,time);
	}
}
		
		
		