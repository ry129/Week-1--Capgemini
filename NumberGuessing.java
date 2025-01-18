import java.util.*;
public class NumberGuessing{

public static void main(String args[])
{
      Scanner sc= new Scanner(System.in);
	  NumberGuessingMethods obj = new NumberGuessingMethods();
	
		System.out.println("System will find your guessed  number. Guess between(0-100): ");
	
		obj.guess();
	
}

}





class NumberGuessingMethods{

      
    static int count=1;
public void guess()
{
	Random r = new Random();
	 Scanner sc= new Scanner(System.in);
	 
	 
	  int low = 0;
       int high = 100;
        int result = r.nextInt(high-low) + low;
		System.out.println("Remark on guess : "+result);
		String text= sc.next();
		
		
	 while(text!="correct"){
	
	 if(text.equals("small"))
	{
		
		count++;
		 low = Math.min(result,low);
        high = result;
         result = r.nextInt(high-low) + low;
		 System.out.println("Remark on guess : "+result);
		 text= sc.next();
		
		
	}
	else if(text.equals("large"))
	{
		count++;
		 low = result;
        high = Math.max(high,result);
         result = r.nextInt(high-low) + low;
		 System.out.println("Remark on guess : "+result);
		 text= sc.next();
	}
	else{
		break;
	}
	 }
	 
	 if(text.equals("correct"))
	{
		System.out.println("You guessed the number in : "+ count+ " chances");
	}	
}



}