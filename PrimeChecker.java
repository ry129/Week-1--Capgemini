
import java.util.*;

public class PrimeChecker{
public static void main(String [] args)
  {
	PrimeCheckerMethod obj= new  PrimeCheckerMethod();
	 int n1=obj.inputone();
	 
     System.out.println(obj. checkerMethod(n1));
	
}
}

class  PrimeCheckerMethod{

  public int inputone()
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter  number :");
  int n1=sc.nextInt();
  return n1;
  }
  
  public boolean checkerMethod(int n1)
  {
	boolean flag=true;
  for(int i=2;i<n1/2;i++)
  {
	if(n1%i==0)
	{
		flag =false;
		break;
	}

  }
  return flag;
  
  }


}