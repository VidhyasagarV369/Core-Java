package Methods;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your height:");
		float height = sc.nextFloat();
		System.out.println("Enter your weight:" );
		double weight = sc.nextDouble();
		System.out.println("Enter your Martial status:" );
		boolean Married = sc.nextBoolean();
		sc.nextLine();
		System.out.println("Enter your Spouse name:" );
		String Spouse = sc.nextLine();
		
		System.out.println("\nYour height is:" + height);
		System.out.println("\nYour Weight is:" + weight);
		System.out.println("\nYour Martial status:" + Married);
		
//		String Spouse ="";
		if(Married)
		{
		System.out.println("\nYour Spouse name:" + Spouse);
		}
		else
			System.out.println("you're single");
		Spouse =sc.nextLine();
		
		
		double BMI= weight/(height*height);
		System.out.println("\nThe Body Mass index is: " + BMI);
		if(BMI<=20)
		{
			System.out.println("you're under weight");
		}
			else if(BMI<24)
			{
				System.out.println("you're normal weight");
			}
		}
		
			
		
		
		
		
		
		
				
	}


