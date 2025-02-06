import java.util.Scanner;

class VolumeOfCylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("Enter radius of cylinder : ");
		float radius = sc.nextFloat();
		System.out.print("Enter height of cylinder : ");
		float height = sc.nextFloat();
		float pi = 22/7;
		
		float area = pi * radius * radius ;
		float volume = area * height;
		
		System.out.println("The area of cylinder is :" + area);
		System.out.println("The volume of cylinder is :" + volume);
	}
}
