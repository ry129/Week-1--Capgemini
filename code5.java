import java.util.*;
class Main{
	public static void check(String s1 , String s2){
		int count=0;
		
		for(int i=0;i<s1.length();i++){	
			for(int j=i;j<=i;j++){
			String subs= s1.substring(i+" "+j);	
			count++;
			}
		}
		return count;
		return subs;
	}
   public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
	System.out.println(check(s1,s2));
		
	}
}
			
			
			
		
		
		
		