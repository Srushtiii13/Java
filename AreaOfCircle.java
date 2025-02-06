import java.util.Scanner;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius:");
		float r = sc.nextFloat();
		final float pi = 22/7;
		float area = pi*r*r;
		
		float perimeter = 2* pi * r;
		System.out.println("Area of Circle for radius "+ r + " is :"+area);
		System.out.println("Perimeter of the Circle for radius " + r + " is : " +perimeter);
	}
}
