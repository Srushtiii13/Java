import java.util.Scanner;

class BMIComputation 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in pounds :");
		float weight = sc.nextFloat();
		float onePound = 0.45359237f;
		weight = weight*onePound;
		
		System.out.print("Enter height in inches :");
		float height = sc.nextFloat();
		float oneInch = 0.0254f;
		height = height*oneInch;
		
		float bmi = weight/(height * height);
		
		
		System.out.println("BMI is : " + bmi);
	}
}
