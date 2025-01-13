import java.util.Scanner;
class Natural{
	public void NaturalNumber(int number){
		int sum=0;
		for(int i=1;i<=number;i++){
			if(number>=0){
				sum+=i;
				}
		}
		System.out.println(sum);
				}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int number=sc.nextInt();
		
		//
		Natural obj=new Natural();
		obj.NaturalNumber(number);
	}
}