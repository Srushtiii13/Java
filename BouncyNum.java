import java.util.Scanner;
class BouncyNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		String num = sc.next();
		String dup = num;
		boolean flagInc = true;
		boolean flagDec = true;
		
		for (int i = 0 ; i < (num.length()-1)  ;i++ )
		{
			char ch = num.charAt(i );
			char ch1 = num.charAt(i+1);
			
			if(ch > ch1)
			{
				flagInc = false;
			}
			else if(ch < ch1)
			{
				flagDec = false;
				//break;
				
			}
			
		}
		
		
		if(flagInc)
			System.out.println( dup + " is a increasing number");
		else if(flagDec)
			System.out.println(dup + " is  a decreasing number ");
		else
			System.out.println(dup + " is a Bouncy number ");
		
	}
}
