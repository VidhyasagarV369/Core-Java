package loops;

public class Palindrome {
	public static void main (String[]args)
	{
		int num = 1551;
		int N = num;
		int rev =0;
		
		while ( num!=0 ) {
		int	digit =num%10;
		rev= rev*10 + digit;
		num = num/10;
		}
		{
			System.out.println(N);
		System.out.println(rev);
			
		}
		{ if(N==rev)
			System.out.println("num is palindrome");
		else
			System.out.println("Num is not palindrome");
			
		}
	}

}
