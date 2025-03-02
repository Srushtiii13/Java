import java.util.Scanner;
class Emirp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int dup =num;
		int  deno = 2;
		while(deno <=num/2)
		{
			if(num %deno == 0)
			{
				break;
			}
			deno++;
		}
		
		if(deno > num/2)
		{
			System.out.println("Its prime");
			int rev =0;
			while(num > 0)
			{
				int rem = num%10;
				rev =rev*10 + rem;
				num /=10;
			}
			
			int  den = 2;
			while(den <=num/2)
			{
			if(num %den == 0)
			{
				break;
			}
				den++;
			}
		
			if(den > num/2)
			{
				System.out.println(" Entered numb is emirp");
			}
		}
		else
		{
			System.out.println("Not a Prime");
		}
		
		
		
		//int rev = 0;
		//while(num)
	}
}
