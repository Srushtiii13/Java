import java.util.Scanner;
class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("			LOAN CALCULATOR");
		System.out.println();
		System.out.print("Enter the amount : ");
		float amt = sc.nextFloat();
		System.out.print("Enter ROI : ");
		float roi = sc.nextFloat();
		System.out.print("Enter the tenure(months) : ");
		int month = sc.nextInt();
		
		//Convert from month to year
		String str = (month/12) + "." +(month%12);
		float con = Float.parseFloat(str);
		
		System.out.println();
		System.out.println("LOAN CALCULATION ");
		System.out.println("Principal amount : " + amt);
		System.out.println("Rate of Interest : " + roi + "%");
		System.out.println("Tenure :" + month + " months");
		
		float intYear = amt*roi/100;
		float totalInter = intYear*con;
		System.out.println("Interest : " + totalInter );
		float outstanding = amt + totalInter ;
		System.out.println("Total Outstanding Amount : " + outstanding);
		System.out.println("EMI : " + (outstanding/month) + " rs");
		
		
		
		System.out.println();
	}
}
