import java.util.Scanner;

class rounds{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the first side");
	double a=sc.nextDouble();
	
	System.out.println("enter the second side");
	double b=sc.nextDouble();
	
	System.out.println("enter the third side");
	double c=sc.nextDouble();
	
	
	//perimeter of triangle
	double perimeter=a+b+c;
	
	//no of rounds
	double round=5000/perimeter;
	
	
	
	//output
	System.out.println("The total number of rounds the athlete will run is "+round+" to complete 5 km");

	
	sc.close();
	
	}
}