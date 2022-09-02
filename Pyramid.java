package practice;

public class Pyramid {

	public static void main(String[] args) {
		for(int x=1; x<=7; x++) 
		{
			for(int y=7; y>=x; y--) 
			{
				System.out.print(" ");
			}
			for(int z=1; z<=x; z++ ) 
			{
				System.out.print(" "+z);
			}
			System.out.println();
		}

	}

}
