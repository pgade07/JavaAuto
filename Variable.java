package practice;

public class Variable {
int a=45;     //global variable
int b=57;
static int c=105;    //static variable
public void prisha1()     
{
	boolean d=45<35;  //local variable
	System.out.println("My output is  "+  d);
}
public static void prisha2() 
{
	float e=7.2f;
	System.out.println(c*e);
	}
public static void main (String[] args) 
{Variable p= new Variable();
p.prisha1();
prisha2();
RaviMethod A= new RaviMethod();
A.ravi1(50);
	}
}
