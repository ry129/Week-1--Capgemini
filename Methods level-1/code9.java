import java.util.Scanner;
class Remainder{
	public static int[] findRemainderandQuotient(int number,int number2){
		int []arr = new int[2];
		arr[0]=number/number2;
		arr[1]=number%number2;
		
		
		return arr;
			
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number1  :");
		int number=sc.nextInt();
		System.out.println("Enter Number 2  :");
		int number2=sc.nextInt();
		
		
		int []a =Remainder.findRemainderandQuotient(number,number2);
		System.out.println(a[0] + " , " + a[1]);		
		
		
}
}