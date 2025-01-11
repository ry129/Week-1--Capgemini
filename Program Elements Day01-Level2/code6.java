import java.util.Scanner;

class income{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the salary");
	int salary=sc.nextInt();
	
	System.out.println("enter the bonus");
	int bonus=sc.nextInt();
	
	//income
	int i=salary+bonus;
	
	//output
	System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". "+" Hence Total Income is INR "+i);
	
	sc.close();
	
	}
}