import java.util.*;
import java.util.Scanner;
class team{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		double []height = new double[11];
		double sum=0;
		System.out.println("Enter 11 values");
		for(int i=0;i<height.length;i++){
			System.out.print("Enter height " +(i+1) + " :");
			height[i]=sc.nextDouble();
		}
			//sum of all elements present in array
			for(int i=0;i<height.length;i++){
				sum+=height[i];
				System.out.println(sum);
			}
			double meanheight = sum/height.length;
			 System.out.println("The mean height is: " + meanheight);
		}
	}
	

		