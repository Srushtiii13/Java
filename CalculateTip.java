import java.util.Scanner;

class calculateTip
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		float subTotal = sc.nextFloat();
		System.out.println("Enter the subtotal :");
			float tiprate = sc. nextFloat();
		System.out.println("Enter the gratuity rate :");
		
		
		float tip = subTotal *(tiprate/100);
		float total =tip + subTotal;
		
		System.out.println("The tip is: " + tip +" and the total is: "+total);
		System.out.println();
	}
}
