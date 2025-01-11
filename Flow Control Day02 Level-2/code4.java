import java.util.Scanner;

class code4{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the no");
	  int n=sc.nextInt();
	

    int d=n/2;
	boolean isPrime=true;
	
	for(int i=2;i<=d;i++){
	if(n%i==0) isPrime=false;
	
	
	}
	if(isPrime)System.out.println("It is prime number");
	else System.out.println("It is not a prime number");
	
	
	 sc.close();
	}
}