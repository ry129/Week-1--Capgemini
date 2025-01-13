import java.util.Scanner;
class Chocolates{
	public static int[] childrenchocolates(int children,int chocolates){
		int []arr = new int[2];
		arr[0]=chocolates/children;
		arr[1]=chocolates%children;
		
		
		return arr;
			
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number of Children  :");
		int children=sc.nextInt();
		System.out.println("Enter Number of chocolates  :");
		int chocolates=sc.nextInt();
		
		
		int []a =Chocolates.childrenchocolates(children,chocolates);
		System.out.println("Number of chocolates equally distributed " +a[0] + " , " + "number of remaining chocolates are " + a[1]);		
		
		
}
}