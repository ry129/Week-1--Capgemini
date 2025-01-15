import java.util.Scanner;
class string1{
	public static String subString(String s1 , int start , int end){
		String str="";
		for(int i=start;i<end;i++){
			char ch=s1.charAt(i);
			str+=ch;
		}
		return  str;
	}
		
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		
		int start=sc.nextInt();
		int end = sc.nextInt();
		
		
		String st2=s1.substring(start,end);
		
		String str3= (string1.subString(s1,start,end));
		
		if(st2.equals(str3)){
			System.out.println("The substring is " + st2);
		}
		else {
			System.out.println("Not equal");
		}
	}
}