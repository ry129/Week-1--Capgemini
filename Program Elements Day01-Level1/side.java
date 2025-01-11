import java.util.Scanner;

class side{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the perimeter");
	
	double perimeter=sc.nextDouble();
	
	//side perimeter=4*side;
	double side=perimeter/4;
	
	
	//output
	System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter );
	
	}
}