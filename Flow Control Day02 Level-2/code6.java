import java.util.Scanner;

class code6{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the no");
	  int n=sc.nextInt();
	
	int i=0;

    if(n>=0){
	
	while(i<=n){
	if(i%15==0)System.out.println("FizzBuzz");
	else if(i%5==0)System.out.println("Buzz");
	else if(i%3==0)System.out.println("fizz");
	else System.out.println(i);
	i++;
	}
	
	}
	
	
	 sc.close();
	}
}