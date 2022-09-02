package practice;

public class ThisKeyword {
	int a=10;//global variable
	short b=20;
	public void city()
	{ int a= 50;  //local variable
	int b=100;
	a=this.a;  //output is 10
		System.out.println(a);  //10
		System.out.println(b);  //100
		System.out.println(a+b);  //110
		System.out.println(this.a);  //10
		System.out.println(this.a+this.b);//30
	}
	public static void main(String[] args) {
		ThisKeyword p =new ThisKeyword ();
		p.city();}
	}

