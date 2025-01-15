import java.util.*;
class importexp{
	public static int length(String s){
		char str;
		int count=0;
		
		for(int i=0;     ;i++){
			try{
			str =s.charAt(i);
			count ++;
			}
			catch (Exception e) {
           break;
			}
		}
		return count;
	}
	
	
	public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			 
			 int len  = s.length(); 
			System.out.println( importexp.length(s));			
	}
}
			 