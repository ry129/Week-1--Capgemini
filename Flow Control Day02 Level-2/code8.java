import java.util.Scanner;

class code8{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("age of amar");
	  int a=sc.nextInt();
	  System.out.println("age of akbar");
	  int b=sc.nextInt();
	  System.out.println("age of anthony");
	  int c=sc.nextInt();
	  
	  
	  
	System.out.println("height of amar");
	  int p=sc.nextInt();
	  System.out.println("height of akbar");
	  int q=sc.nextInt();
	  System.out.println("height of anthony");
	  int r=sc.nextInt();
	  
	  
    if(a<b&&a<c)System.out.println("Amar is youngest");
    else if(b<a&&b<c)System.out.println("Akbar is youngest");
    else if(c<a&&c<b)System.out.println("Anthony is youngest");
	
	if(p>q&&p>r)System.out.println("Amar is tallest");
    else if(q>p&&q>r)System.out.println("Akbar is tallest");
    else if(r>p&&r>q)System.out.println("Anthony is tallest");


	 sc.close();
	}
}