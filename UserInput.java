package practice;

import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("What is your name");
	String t= s.nextLine();
	System.out.println("your name is:  " +t);
	
	System.out.println("What is your date of birth");
	String t2= s.nextLine();
	System.out.println("Date od birth is:  "+t2);
	
	System.out.println("What is your phone number");
	long t3=s.nextLong() ;
	System.out.println("enter your phone number:  "+t3);
	
	System.out.println("What is your pin code");
	int t4=s.nextInt();
	System.out.println("Enter your pin code");
	
	s. close();	
}}
