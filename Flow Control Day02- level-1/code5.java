import java.util.Scanner;
class Vote{
	public static void main(String[]args){
		//Scanner object
		Scanner sc=new Scanner(System.in);
		//input user
		System.out.println("Enter Age");
		int age=sc.nextInt();
		//conditions to  whether the person is able to vote or not
		if(age >=18 || age == 18){
			System.out.println("Person can vote");
		}
		else {
			System.out.println("Person can't vote");
		}
	}
}
		