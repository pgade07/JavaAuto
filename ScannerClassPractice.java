package practice;

import java.util.Scanner;

public class ScannerClassPractice {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("What is your name?");
		String t= s.nextLine();
		System.out.println("Enter your name:  "+t);
		
		System.out.println("What is contact number?");
		long t2= s.nextLong();
		System.out.println("Enter your phone number: "+t2);
		
		System.out.println("what is pin code?");
		int t3= s.nextInt();
		System.out.println("Enter your pin code:  "+t3);
		
		s.close();
}
}
