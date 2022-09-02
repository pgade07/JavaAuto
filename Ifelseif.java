package practice;

public class Ifelseif {
	public static void main(String[] args) {
		int marks = 5;
		
		if(marks >=35 && marks <=40)
		{
			System.out.println("Congratulations.. Your Grade is D");}
		
		else if(marks > 40 && marks <=50)
		{
			System.out.println("Congratulations.. Your Grade is C");
		}
		else if(marks >50 && marks <=75)
		{
			System.out.println("Congratulations.. Your Grade is B");
		}
		else if(marks>75 && marks <=100)
		{
			System.out.println("Congratulations.. Your Grade is A");
		}
		else
		{
			System.out.println("Unfortunatly your not did clear exam");}
}}
