import java.util.Scanner;

class code11{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the no");
	  int n=sc.nextInt();
	

    
	 
	
	for(int i=1;i<=n;i++){
	if(n%i==0) System.out.println(i);
	
	
	}
	
	
	
	
	 sc.close();
	}
}