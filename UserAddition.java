package practice;

import java.util.Scanner;

public class UserAddition
{
     public void city () {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter value a:  ");
		int a= s.nextInt();
		System.out.println("enter value a: "+a);
		
		System.out.println("enter value b:  ");
		int b= s.nextInt();
		System.out.println("enter value b: "+b);
		
		int c=a+b;
		System.out.println("Addition is :  "+c);
		
		int d=a*b;
		System.out.println("multipication is :  "+d);
	}
     public static void main(String[] args) {
    	 UserAddition A=new UserAddition();
    	  A. city();
	}}
