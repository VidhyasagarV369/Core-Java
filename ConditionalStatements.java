package conditionoalstatement;

public class ConditionalStatements {
	public static void main (String[]args)
	{
	int Maths = 99;
	int Science = 85;
	int English = 33;
	
	System.out.println("Total marks is " + (Maths + English + Science));
	
	int avg = (Maths + English + Science)/3;
	System.out.println("Average Marks1 =" + avg);
	
	
	String grade = "pass";
	if(avg >= 90)
	{
		grade="A+";
	}
	else if(avg >= 75)
	{
		grade="A";
	} 
	else if(avg >= 60)
	{
		grade="B";
	}
	else if(avg >= 40)
	{
		grade="C";
	}
	else
	{
		grade = "fail";
	
	}

	System.out.println("Grade is " + grade);

	if (grade.equals("fail")) {
        System.out.println("Please work harder next time.");
    } else if (grade.equals("A+") || grade.equals("A")) {
        System.out.println("Excellent performance!");
    } else {
        System.out.println("Keep improving.");
    }
    if (Maths < 35 || Science < 35 || English < 35) {
        System.out.println("Failed due to low score in at least one subject.");
    }
	}
}

