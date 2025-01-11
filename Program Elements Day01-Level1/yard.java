import java.util.Scanner;

class yard{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the distance in feet");
	
	double feet=sc.nextDouble();
	
	//1mile=1760yard and 1yard=3feet
	double yard=feet/3;
	double mile=yard/1760;
	
	
	//output
	System.out.println("The distance in yard is "+yard+" and in miles is "+mile);
	
	sc.close();
	
	}
}