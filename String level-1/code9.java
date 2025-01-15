import java.util.*;
class convertor{
	public static String Case(String text){
		String result="";
		for(int i=0;i<text.length();i++){
			char ch=text.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
               
                ch = (char) (ch - 32);
            }

         result += ch;
        }

        return result;
    }
	public static boolean compare(String str , String str2){
		//if(str.length()!=str2.length()){
		//	return false;
		//}
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=str2.charAt(i)){
				return false;
			}
		} 
		return true;
	}
	
			public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter text");
	String text=sc.nextLine();
	
	String s1=text.toUpperCase();
	String s2=convertor.Case(text);
	
	
	if(convertor.compare(s1,s2)){
			System.out.println("Yes both are equal :\n" + " and new String is " + s2);
		}
		
		else{
			System.out.println(" Both are not equal ");
		
		
	}
			}
}