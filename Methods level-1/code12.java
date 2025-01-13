import java.util.Scanner;

class Angle{
public double[] calculateTrigonometricFunctions(double angle){
   
        double[] a= new double[3];
		
		double r=angle*0.0175;
	     
		 a[0]=Math.sin(r);
		 a[1]=Math.cos(r);
		 a[2]=Math.tan(r);
		
		 
		 return a;
   }
   
   
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		//take input
		
		System.out.println("enter the angle");
		double n1=sc.nextDouble();
		

		
		Angle obj=new Angle();
		double[] arr=obj.calculateTrigonometricFunctions(n1);
		
		System.out.println("the sine is "+arr[0]+" the cosine is "+arr[1]+" and the tangent is "+arr[2]);
		
		sc.close();
		
		
   }
   
   
}