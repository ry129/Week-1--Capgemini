import java.util.*;
import java.util.Scanner;
class Number{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		int [] arr= new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter the number " + (i+1) + " :");
			arr[i]=sc.nextInt();
		}
			//check the number to perform operation
			for(int i=0;i<arr.length;i++){
				if(arr[i]>0){
					if(arr[i]%2==0){
						System.out.println("Number is even");
					}
						else {
							System.out.println("Number is odd");
						}
					}
					else if(arr[i]<0){
						System.out.println("Number is Negative");
					}
					else{
						System.out.println("Number is zero");
					} 
			}
			//compare first and last element
			int firstElement = arr[0];
			int lastElement = arr[arr.length-1];
			if(firstElement > lastElement){
				System.out.println("Greater");
			}
			else if(firstElement < lastElement){
				System.out.println("Lesser");
			}
			else{
				System.out.println("Equal");
			}
	}
}
					
	


					
				