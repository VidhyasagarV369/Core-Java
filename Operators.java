package myfirstprogram;

public class Operators {
	public static void main (String[]args)
	{
	int Maths = 57;
	int Science = 46;
	int English = 58;
	{
	System.out.println("Total marks is " + (Maths + English + Science));
	}
	{
	int avg = (Maths + English + Science)/3;
	System.out.println("Average Marks1 =" + avg);
	}
	{
	float avg1 = (Maths + English + Science)/3.0f;
	System.out.println("Average Marks2 =" + avg1);
	}
	{
	double avg2 = (Maths + English + Science)/3.0;;
	System.out.println("Average Marks3 =" + avg2);
	}
	}
}
