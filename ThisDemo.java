package practice;

public class ThisDemo 
{
	int a=10;
	String s="xyz";
	float c=15.5f;
	ThisDemo(int a, String s, float c)    //Constructor
	{
		a=this.a;
		System.out.println(this.a);    //this keyword
		System.out.println(this.s);
		System.out.println(this.c);
	}
	public static void main(String[] arg)
	{
		new ThisDemo(5,"abc",5.5f);
	}
}
