import java.util.Scanner;

class code12{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the no");
	  int n=sc.nextInt();
	
	
	

	
	for(int i=100;i>0;i--){
	
	if(i%n==0)	System.out.println(i);

	
	}
	
	
	
	
	 sc.close();
	}
}