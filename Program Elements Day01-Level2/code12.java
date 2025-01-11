import java.util.Scanner;

class numbers{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the weight");
	int weight=sc.nextInt();
	
	//convert in kg 1pound=2.2kg
	double kg=weight*2.2;
	
	//output
	System.out.println("The weight of the person in pound is "+weight+" and in kg is "+kg);
	
	sc.close();
	
	}
}