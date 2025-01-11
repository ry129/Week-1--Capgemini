import java.util.Scanner;
class Compare{
	public static void main(String[]args){
		//Scanner object
		Scanner sc=new Scanner(System.in);
		//input user
		System.out.println("Enter Number ");
		int number=sc.nextInt();
		int sum=0;
		int sum1= (number*(number+1))/2;
		for(int i=number;i>=1;i--){
			sum+=i;
		}
	if(sum==sum1){
		System.out.println("Result for both computation is correct");
	}
	else{
		System.out.println("Result for both is not correct");
	}
	}
}