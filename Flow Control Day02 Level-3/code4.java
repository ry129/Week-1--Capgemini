import java.util.*;

 class AbundantNumber{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		int  num1= sc.nextInt();
		int num=num1;
		int count=0;
		int temp=0;
		for(int i=1;i<=num1/2;i++)
		{
		 if(num1%i==0)
		 {
		   count+=i;
		 }
		
		}

		if(num1<count)
		{System.out.println("It is a Abundant number");} 
		else {System.out.println("It is not a Abundant number");}
	}
}