import java.util.*;
class Main{
	public static String reverse(String text){
		String str="";
		char ch;
		for(int i=text.length()-1;i>=0;i--){
		 ch=text.charAt(i);
			str+=ch;
		}
		return str;
	}
	public static boolean check(String text){
    String temp = reverse(text);
     if(text.equals(temp)){
     return true;
     }
     else {
        return false;
       }
	}	
		
	  public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Text");
		String text=sc.nextLine();
		if(Main.check(text)){
			 System.out.println("Palindrome String");
		 }
		 else {
			 System.out.println("Not a Palindrome String");
		 }
	}
}