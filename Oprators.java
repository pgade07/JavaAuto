package practice;

public class Oprators
{
	public static void main(String[] args) {
		pune();
		int a=15;
		//int b=5;
		//b=a;   //10
		//b=++a;   //b=10 ,a=10+1=11
		System.out.println(a);   //15
		System.out.println(a--);  //15-1=14
		System.out.println(a--);  //14-1=13
		System.out.println(a--);    //13-1=12
	
		System.out.println(a); 
	}
	public static void pune()
	{
	int a=12;
	System.out.println(a++);  //z=12+1 a=12, a=13 store
	System.out.println(a);  //a=13
    System.out.println(a++);
     }
}
