import java.util.Scanner;

class code1{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the year");
	  int n=sc.nextInt();
	 int d=n/4;
     if(n>=1582){
	 if(n%4==0 &&n%100!=0)	System.out.println("the year is leap year");
	 else if(n%400==0 )	System.out.println("the year is leap year");
	 else	System.out.println("the year is not leap year");


	 }
	 else	System.out.println("the year is not leap year");



	 sc.close();
	}
}