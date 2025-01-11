import java.util.Scanner;

class kilometer{
   public static void main(String[] args){
     
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the distance in km");
	 //take input in km
	 int x=sc.nextInt();
	 
	 //convert 1m=1.6km
	 double miles=x*0.621;
	 
	 //display the result
	 System.out.println("The total miles is "+ miles+" mile for the given "+ x+" km");
	 
	 sc.close();
	 
   }
}