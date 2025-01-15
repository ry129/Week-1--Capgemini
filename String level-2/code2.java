import java.util.*;
class code2{
	public static int compare(String str){
		char string;
		int count =0;
		for(int i=0;     ;i++){
			try{
			string =str.charAt(i);
			count ++;
			}
			catch (Exception e) {
           break;
			}
		}
		return count;
	}
	public static String[] split(String str){
		int n=1;
	for(int i=0;i<compare(str);i++){
		if(str.charAt(i)==' '){
			n++;
		}
	}
	String[]arr=new String[n];
	String str2="";
	int index=0;
	for(int i=0;i<code2.compare(str);i++){
		if(str.charAt(i)==' '){
			arr[index]=str2;
			index++;
			str2="";
		}
		else{
			str2+=str.charAt(i);
		}
	}
	arr[index]=str2;
return arr;
	}	
	public static boolean equal(String arr2[],String arr3[]){
		if(arr2.length!=arr3.length){
			return false;
		}
		for(int i=0;i<arr2.length;i++){
			if(!arr2[i].equals(arr3[i])){
				return false;
			}
		}
		return true;
	}
		
		
		
		
		
		
  public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Text");
			String str=sc.nextLine();
			
			String [] arr2 = str.split("\\s+");
			String [] arr3 = split(str);
			if(code2.equal(arr2,arr3)){
			System.out.println("Yes both are equal :\n" + Arrays.toString(arr3));
		}
		
		else{
			System.out.println(" Both are not equal ");
		
		
	}
}}
			
			