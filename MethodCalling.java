package practice;

public class MethodCalling {
	public static void prisha(int a)
	{
	int c=17;
	System.out.println(a-c);
	}
	public void harish() {
		int d=75;
		float e= 3.5f;
		System.out.println(d*e);
	}
	 static public void main (String[] args) {
		MethodCalling z=new MethodCalling();
		z.harish();
		prisha(25);
		RaviMethod p= new RaviMethod();
		p.ravi1(50);
		RaviMethod.ravi2(2.5f,3.5f);
		
	}
}
