class IncreasingNum
{
	public static void main(String[] args) 
	{
		String num = "98765";
		boolean flagInc = true;
		boolean flagDec = true;
		
		for (int i = 0 ; i < (num.length()-1)  ;i++ )
		{
			char ch = num.charAt(i );
			char ch1 = num.charAt(i+1);
			
			if(ch > ch1)
			{
				flagInc = false;
				//break;
			}
			else if(ch < ch1)
			{
				flagDec = false;
				//break;
				
			}
			else
			{
				System.out.print("bouncy");
				break;
				
			}
		}
		
		
		if(flagInc)
			System.out.println("Increasing");
		else if(flagDec)
			System.out.println("Decreaing");
		else
			System.out.println("Bouncy");
		
	}
}
