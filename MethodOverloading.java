package practice;

public class MethodOverloading {
	int a= 50;
	int b= 15;
	int c= 55;
	public void car() {
		System.out.println(a+b+c);
	}
	public void car(int a, int b) {
		System.out.println(a/b);
	}
	public static void car(float e, String s) {
		float d= 23.5f;
		System.out.println(e+d  +   s);
	}
	public static void main (String[] args) {
		MethodOverloading a=new MethodOverloading();
		a.car();		
		a.car(24,12);
		car(8.5f,"Micra");
		new Constructor(45,2.5f);
		  new Constructor(67);
		  new Constructor("Prisha");
	}
	}

