import java.util.Scanner;
class Number{
	public int check(int number){
		if(number>0){
			return 1;
		}
			else if(number<0){
				return -1;
				
			}
			return 0;
				
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int number=sc.nextInt();
		
		//
		Number obj=new Number();
		int a=obj.check(number);
		System.out.println(a);
	}
}
		
		