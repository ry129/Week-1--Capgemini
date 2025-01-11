import java.util.*;

class Calculator{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number for calculation :");
		double  num1= sc.nextInt();
		double  num2= sc.nextInt();
		System.out.println("Enter operation to perform +, -, *, / :");
	    String op = sc.next();
		double result=0.0;
		switch(op)
		{
		case "+" :
		result=num1+num2;
		break;
		
		case "-" :
		result=num1-num2;
		break;
		
		
		case "*" :
		result=num1*num2;
		break;
		
		case "/" :
		result=num1/num2;
		break;
		
		default :
		System.out.println("Enter valid operation like: +, -, *, / :");
		break;
		
		}
		System.out.println("Result is : "+ result);

          
	}
}