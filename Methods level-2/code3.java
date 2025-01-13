import java.util.Scanner;
class Year{
	public void leapyear(int year){
		 if(year>=1582&&(year%4==0 && year%100!=0)||(year%400==0)){
	 System.out.println("the year is leap year");

			}
			else {
				System.out.println("Not a leap year");
			}
		
}
	//
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year");
		int year = sc.nextInt();
		//
		Year obj = new Year();
		obj.leapyear(year);
	}
}