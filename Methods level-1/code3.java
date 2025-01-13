import java.util.Scanner;
class Handshakes{
	public void handshakes(int students){
		System.out.println("Possible handshakes are :" + (students * (students - 1)) / 2);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students :");
		int students=sc.nextInt();
		
		//
		Handshakes obj=new Handshakes();
		obj.handshakes(students);
	}
}