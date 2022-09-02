package practice;

public class RaviMethod {
	
		//Method overloading
	public void ravi1(int a) //Non static method
	{
		int b=25;
	System.out.println(a-b);
	}
	public static void ravi2(float a, float b) //static method
	{
		System.out.println(a*b);
		}
	public static void main(String[] args) {
		RaviMethod p= new RaviMethod();
		p.ravi1(50);
		ravi2(2.5f,3.5f);
	}
	}

