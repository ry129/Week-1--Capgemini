import java.util.Scanner;

class code10{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the no");
	  int n=sc.nextInt();
	
	System.out.println("enter the power");
	  int power=sc.nextInt();
	

    int value=1;
	
	for(int i=1;i<=power;i++){
	
	value*=n;
	
	}
	System.out.println(value);
	
	
	
	 sc.close();
	}
}