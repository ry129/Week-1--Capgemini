import java.util.Scanner;

class totalPrice{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the unit price");
	
	double up=sc.nextDouble();
	
	System.out.println("enter the quantity");
	
	int quantity=sc.nextInt();
	
	//total price
	double total=up*quantity;
	
	
	//output
	System.out.println("The total purchase price is INR "+total+" if the quantity "+quantity+" and unit price is INR "+up);
	
	sc.close();
	
	}
}