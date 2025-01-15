import java.util.*;
class string{
	public static char[] charArray(String s){
		//int index=0;
		char[]arr=new char[s.length()];
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			arr[i]=ch;
		}
		return arr;
	}
	public static boolean array(char [] array,char [] str3){
		for(int i=0;i<array.length;i++){
		if(array[i]!=str3[i]){
			return false;
		}
		
		}
		return true;
	}
	
	public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
		char[] array=s.toCharArray();
		char[] str3= (charArray(s));
		
		if(string.array(array,str3)){
			System.out.println("Yes both are equal :\n" + Arrays.toString(str3));
		}
		
		else{
			System.out.println(" Both are not equal ");
		
		
	}
}}