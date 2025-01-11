import java.util.Scanner;

class code3{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("marks in physics");
	  double p=sc.nextDouble();
	  System.out.println("marks in chemistry");
	  double c=sc.nextDouble();
	  System.out.println("marks in maths");
	  double m=sc.nextDouble();
	  
	  
	  //average marks
	  double avg=(p+c+m)/3;
	  
	  if(avg>=80)System.out.println(avg+"-Grade A, Level 4, above agency-normalized standards");
	  else if(avg>=70)System.out.println(avg+"-Grade B, Level 3, at agency-normalized standards");
	  else if(avg>=60)System.out.println(avg+"-Grade c, Level 2, below, but approaching agency-normalized standards");
	  else if(avg>=50)System.out.println(avg+"-Grade D, Level 1, well below agency-normalized standards");
	  else if(avg>=40)System.out.println(avg+"-Grade E, Level 1-, too below agency-normalized standards");
	  else System.out.println(avg+"-Grade R, Remedial standards");
	
	



	 sc.close();
	}
}