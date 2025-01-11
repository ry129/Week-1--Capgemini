import java.util.Scanner;

class code2{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the year");
	  int n=sc.nextInt();
	 
     if(n>=1582&&(n%4==0 &&n%100!=0)||(n%400==0)){
	 System.out.println("the year is leap year");
	

	 }
	 else	System.out.println("the year is not leap year");



	 sc.close();
	}
}