import java.util.Scanner;
class Calculate{
	public static double calculatewindchill(double temp , double windspeed){
		double windChill = (35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windspeed,0.16)); 

			return windChill;
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Temperature  :");
		double temp=sc.nextInt();
		System.out.println("Enter WindSpeed  :");
		double windspeed=sc.nextInt();
		
		
		Calculate obj=new Calculate();
double a = obj.calculatewindchill(temp,windspeed);
System.out.println("The wind chill temperature is " + a);		
		
		
}
}