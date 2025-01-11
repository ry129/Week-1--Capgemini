import java.util.Scanner;

class handshake{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the no of student");
	
	int n=sc.nextInt();
	
	//no of handshake
	int handshake=(n*(n-1))/2;
	
	
	//output
	System.out.println("The number of possible handshakes are "+handshake);
	
	sc.close();
	
	}
}