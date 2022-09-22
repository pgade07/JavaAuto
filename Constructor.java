package practice;

public class Constructor 
{
	Constructor(int a, float c)
	  {
		System.out.println(a);
	   }
	Constructor(int b)
	  {
		System.out.println(b);
		}
	Constructor(String s)
	  {
		System.out.println(s);
	  }
//public void method()
//{System.out.println("this is method");}
	public static void main(String[] args) 
	 {
	  new Constructor(45,2.5f);
	  new Constructor(67);
	  new Constructor("Prisha");
	 }
}

