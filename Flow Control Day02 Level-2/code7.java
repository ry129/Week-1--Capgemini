import java.util.Scanner;

class code7{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the weight");
	  int weight=sc.nextInt();
	  
	  System.out.println("enter the height");
	  int height=sc.nextInt();
	  
	  //new height
	  double h=height*0.01;
	  
	  //bmi
	  double bmi=weight/(h*h);
	 
	  
	  if(bmi<=18.4)System.out.println("Underweight");
	  else if(bmi>=18.5 && bmi<=24.9)System.out.println("Normal");
	  else if(bmi>=25.0 && bmi<=39.9)System.out.println("Overweight");
	  else if(bmi>=40.0)System.out.println("Obese");
	



	 sc.close();
	}
}