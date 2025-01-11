import java.util.Scanner;

class fees{
   public static void main(String[] args){
   
      Scanner sc=new Scanner(System.in);
	  //take fee as input
	  double fee=sc.nextDouble();
	  
	  //take discount percent as input
	  double d=sc.nextDouble();
	  
	  //discount
	  double discount=fee*d/100;
	  
	  // discounted price 
	  double dp=fee-discount;
	  
	  //the desired output
	 System.out.println("The discount amount is INR "+ discount+" and final discounted fee is INR " +dp);
	 
	 sc.close();
	 
   }
}