import java.util.Scanner;
class SpyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum = 0 , mul = 1;
		
		for(int i = num ; i>0;i/=10)
		{
			int rem = i %10;
			sum+=rem;
			mul *=rem;
			
			
		}
		System.out.println((sum==mul) ? num + " is a Spy number " : num + " is not a Spy number");
			
		
	}
}
