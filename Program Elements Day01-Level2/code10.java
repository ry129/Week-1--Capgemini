import java.util.Scanner;

class chocolate{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the no of chocolate");
	int numberOfchocolate=sc.nextInt();
	
	System.out.println("enter the no of children");
	int numberOfchildren=sc.nextInt();
	
	
	
	//no of chocolate each child get
	int n=numberOfchocolate/numberOfchildren;

	
	//remaining chocolate
	int remain=numberOfchocolate%numberOfchildren;
	
	
	
	//output
	System.out.println("The number of chocolates each child gets is "+n+" and the number of remaining chocolates are "+remain);

	
	sc.close();
	
	}
}