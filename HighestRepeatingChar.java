import java.util.Scanner;
class HighestRepeatingChar
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		int max = 0;
		char ch1= ' ';
		
		for (char ch = 'a' ; ch<='z'  ;ch++ )
		{
			int cnt=0;
			
			for (int i = 0 ;i<str.length()-1  ;i++ )
			{
				
				if(ch == str.charAt(i ))
					
				{
					cnt++;
					
				}
				
			}
			if(cnt>max)
				{
					max = cnt;
					ch1 = ch;
				}
		}
		
				System.out.println(ch1 + " count : "+ max);
	}
}
