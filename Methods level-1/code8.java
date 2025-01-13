import java.util.Scanner;
class Largest_Smallest{
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int []arr = new int[2];
		if(number1<number2 && number1<number3){
			arr[0]=number1;
		}
		else if(number2<number1&&number2<number3){
			arr[0]=number2;
		} 
		else{
			arr[0]=number3;
		}
		if(number1>number2 && number1>number3){
			arr[1]=number1;
		}
		else if(number2>number3&&number2>number1){
			arr[1]=number2;
		}
		else {
			arr[1]=number3;
		}
		return arr;
			
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number1 1 :");
		int number1=sc.nextInt();
		System.out.println("Enter Number 2 :");
		int number2=sc.nextInt();
		System.out.println("Enter Number 3 :");
		int number3=sc.nextInt();
		
		int []a =Largest_Smallest.findSmallestAndLargest(number1,number2,number3);
		System.out.println(a[0] + " , " + a[1]);		
		
		
}
}