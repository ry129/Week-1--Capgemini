import java.util.Scanner;

class fahrenheit{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the temperature in celcius");
	double c=sc.nextDouble();
	
	//conversion
	double f=(c*9/5)+32;
	
	//output
	System.out.println("The "+c+" celsius is "+f+" fahrenheit");
	
	sc.close();
	
	}
}