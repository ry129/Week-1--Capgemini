import java.util.Scanner;

class code5{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the no");
	  int n=sc.nextInt();
	

    if(n>=0){
	
	for(int i=0;i<=n;i++){
	if(i%15==0)System.out.println("FizzBuzz");
	else if(i%5==0)System.out.println("Buzz");
	else if(i%3==0)System.out.println("fizz");
	else System.out.println(i);
	}
	
	}
	
	
	 sc.close();
	}
}