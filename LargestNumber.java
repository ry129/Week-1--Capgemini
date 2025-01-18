
import java.util.*;

public class LargestNumber{
public static void main(String [] args)
  {
	  LargestNumberMethod obj= new LargestNumberMethod();
	 int n1=obj.inputone();
	  int n2=obj.inputone();
	   int n3=obj.inputone();
     
	obj. checkerMethod(n1,n2,n3);
}
}

class LargestNumberMethod{

  public int inputone()
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter  number :");
  int n1=sc.nextInt();
  return n1;
  }
  
  public void checkerMethod(int n1, int n2, int n3)
  {
  
   boolean n1c=false, n2c=false, n3c=false;
      	 if(n1>n2 && n1>n3)
	 {
	    n1c=true;
		n2c= false;
		n3c=false;
	 }
	 else if(n2>n1 && n2>n3)
	 {
	    n1c=false;
		n2c= true;
		n3c=false;
	 }
	  else if(n3>n1 && n3>n2)
	 {
	    n1c=false;
		n2c= false;
		n3c=true;
	 }
   System.out.println("Is the first number the largest? " + n1c);
   System.out.println("Is the secound number the largest? " + n2c);
   System.out.println("Is the third number the largest? " + n3c);
  
  }


}