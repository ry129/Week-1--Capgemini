import java.util.Scanner;
class SpringSeason{
	public static void main(String[]args){
		//Scanner object
		Scanner sc=new Scanner(System.in);
		//input user
		System.out.println("Enter Month");
		String month=sc.nextLine();
		System.out.println("Enter Day");
		int day=sc.nextInt();
		//conditions to check spring season or not
		if(month.equals("April") || month.equals("May")){
			System.out.println("Entered season is Spring Season");
		}
		else if(month.equals("March")&& day>=20){
			System.out.println("Entered Season is Spring Season");
		}
		else if(month.equals("June")&& day<=20){
			System.out.println("Entered Season is Spring Season");
		}
		else {
			System.out.println("Entered season is not spring season");
		}
	}
}
		
		