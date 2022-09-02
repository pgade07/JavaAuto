package practice;

public class IfElse {
public void Prisha() {
int marks=30;
	if (marks>=35 && marks<=60) 
	{
		System.out.println("graed D");
	}
	else if (marks>=60 && marks<70) {
		System.out.println("graed C");
	}
	else if(marks>70 && marks <=80) {
		System.out.println("graed B");}
	else if(marks>80 &&marks<100) {
		System.out.println("graed A");
		}
	else {System.out.println("Fail");}
	}
    public static void main (String []args) {	
	IfElse z=new IfElse();
		z.Prisha();}
	}
