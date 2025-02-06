import java.util.Scanner;

class PoundsToKgs 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number in pounds :");
		float pounds = sc.nextFloat();
		final float onePound = 0.454f;
		
		float kgs = pounds * onePound;
		System.out.println("The given number :" + pounds + " in kilograms is :" + kgs);
	}
}
