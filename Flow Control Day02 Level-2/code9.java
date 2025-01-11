import java.util.Scanner;

class code9{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the no");
	  int n=sc.nextInt();
	

    int d=n/2;
	 int greatestFactor=1;
	
	for(int i=1;i<=d;i++){
	if(n%i==0) greatestFactor=i;;
	
	
	}
	System.out.println(greatestFactor);
	
	
	
	 sc.close();
	}
}