import java.util.Scanner;
class Triangle{
	public void triangle(double side1,double side2,double side3){
		double km=side1/1000;
		double km2=side2/1000;
		double km3=side3/1000;
		double peri = km+km2+km3;
		double tot= peri/5;
		System.out.println(tot);
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Side 1 :");
		double side1=sc.nextDouble();
		System.out.println("Enter Side2 :");
		double side2=sc.nextDouble();
		System.out.println("Enter Side3 :");
		double side3=sc.nextDouble();
		
		//
		Triangle obj=new Triangle();
		obj.triangle(side1,side2,side3);
}
}