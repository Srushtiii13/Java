class HighestAndLowestFreqOfDigits 
{
	public static void main(String[] args) 
	{
		long num = 14444455l;
		System.out.println(num);
		int minCnt = 9;
		int maxCnt = 0 ;
		for(int i = 0 ; i<=9 ; i++)
		{
			int cnt = 0 ;
			for(long j = num; j>0 ; j/=10)
			{
				long rem = j%10;
				if(i ==rem)
				{
					cnt++;
				}
			}
			if(cnt != 0)
			{
				if(cnt < minCnt)
				{
					minCnt = cnt;
					System.out.println("Lowest Count "+i + " : " + minCnt);
					
				}
				else
					{
					maxCnt = cnt ;
					System.out.println("Highest repeating digit" +i + " : " + maxCnt);
					break;
					}
			}
		}
		
	}
}
