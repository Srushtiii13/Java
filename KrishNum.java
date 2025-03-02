class KrishNum 
{
	public static void main(String[] args) 
	{
		int num = ;
		int dup = num;
		int sum = 0;
		int fact =1;
		for (int i =num ; i> 0;i/=10 )
		{
			int rem = i%10;
			
			
			while(rem>1)
			{
				
				fact *=rem;
				rem--;
			}
			System.out.println(fact);
		}
		System.out.println(fact == dup ? "Krish Num" : " Not a Krish");
	}
}
