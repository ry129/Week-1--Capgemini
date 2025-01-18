import java.util.*;
class Main{
	public static void reverse(String text){
		String str="";
		char ch;
		for(int i=text.length()-1;i>=0;i--){
		 ch=text.charAt(i);
			str+=ch;
		}
		System.out.println("Reverse atring is : " + str);
	}
			
		
	  
	  
	  public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Text");
		String text=sc.nextLine();
		Main.reverse(text);
	}
}