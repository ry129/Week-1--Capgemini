import java.util.Scanner;

class areaTriangle{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the base");
	double base=sc.nextFloat();
	
	System.out.println("enter the height");
	double height=sc.nextFloat();
	
	
	//area in cm^2
	double area=0.5*base*height;
	
	//area in inch 1cm^2=0.155 inch^2
	double inch=area*0.155;
	
	//output
	System.out.println("Area of triangle in square inches is "+inch +" while in square centimeter is "+area );
	
	}
}