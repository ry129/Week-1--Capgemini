import java.util.*;
import java.util.Scanner;
class table{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number=sc.nextInt();
	int [] multiresult = new int[4];
	for(int i=6;i<=9;i++){
		multiresult[i-6] = i*number;
		System.out.println(number + " * " + i + " = " + multiresult[i-6]);
	}
	
	}
}	