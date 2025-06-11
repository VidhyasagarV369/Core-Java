package loops;

public class MultiplicationTable {
	public static void main (String[]args)
	{
		int A=0;
		int i;
		System.out.println("Multiplication Table of 6 is");
		for( i=1;i<=10;i++) {
			 A= i*6;
			System.out.println( i +"*6=" + A);
		}
	}

}
