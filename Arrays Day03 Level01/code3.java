import java.util.*;
import java.util.Scanner;
class Number{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		//define integer array to store result from 1 to 10
		int [] multi=new int[10];
		for(int i=1;i<=10;i++){
			 multi [i-1] = number*i;
		}
		 System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multi[i - 1]);
        }
	}
}
		
			
			