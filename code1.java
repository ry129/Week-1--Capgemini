import java.util.*;
class Main{
	public static void count(String text){
		char ch;
		int count=0;
		int s=0;
		for(int i=0;i<text.length();i++){
			 ch=text.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			count++;
			
		}
		else {
			s++;
		}
		}
		System.out.println("Vowels are :" + count);
		System.out.println("Consonants are :" + s);
	}
	  
	  
	  public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Text");
		String text=sc.nextLine();
		Main.count(text);
	}
}