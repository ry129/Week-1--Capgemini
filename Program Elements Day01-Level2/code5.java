import java.util.Scanner;

class celcius{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the temperature in fahrenheit");
	double f=sc.nextDouble();
	
	//conversion
	double c=(f-32)*5/9;
	
	//output
	System.out.println("The "+f+" fahrenheit is "+c+" celcius");
	
	sc.close();
	
	}
}