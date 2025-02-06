import java.util.Scanner;
class CurrencyConvertor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("*** CURRENCY CONVERTOR***");
		System.out.println();
		System.out.println("Enter the amount (INR):");
		float inr = sc.nextFloat();
		System.out.println("LIST OF CURRENCIES:");
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.NZD");
		System.out.println("4.SNG");
		System.out.println("Enter the currency to be converted");
		String curr = sc.next().toUpperCase();
		float conCurr = 0;
 		
		if(curr.equals("USD"))
		{
			conCurr = inr /86.57F;
			System.out.println(inr+"Indian ruppes is " + conCurr + "USD");
		}
		
		else if(curr.equals("EUR"))
		{
			conCurr = inr /90.28F;
			System.out.println(inr+"Indian ruppes is " + conCurr + "EUR");
		}
		
		
		else if(curr.equals("NZD"))
		{
			conCurr = inr /48.96F;
			System.out.println(inr+"Indian ruppes is " + conCurr + " NZD");
		}
			
		else if(curr.equals("SNG"))
		{
			conCurr = inr /64.02F;
			System.out.println(inr+"Indian ruppes is " + conCurr + " SNG");
		}
		else
		{
			System.out.println("INVALID CURRENCY");
		}
	
	}
}
