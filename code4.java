import java.util.*;
class Main{
	public static String duplicate(String text){
		String rev="";
		for(int i=0;i<text.length();i++){
			int j=0;
			for(j=0;j<i;j++){
				if(text.charAt(i)==text.charAt(j)){
					break;
				}
			}
				if(i==j){
					rev+=text.charAt(i);
				}
			}
		
		return rev;
					
		}	
		
	  public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Text");
		String text=sc.nextLine();
		System.out.println(Main.duplicate(text));
			 
	}
}