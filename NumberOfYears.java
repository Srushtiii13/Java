import java.util.Scanner;

class NumberOfYears 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the minutes :");
		long mins = sc.nextLong();
		long years = (mins)/(365 * 24 *60);
		long yearsMin = years * 365 *24*60;
		long days = (mins - yearsMin) /(60*24);
		System.out.println(mins + " minutes is approximately " + years + " years and " + days + " days.");
		
	}
}
