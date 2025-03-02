import java.util.Scanner;
class NeonNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num :");
		int num = sc.nextInt();
		int dup = num;
		num*=num;
		int sum =0;
		for (int i = num ;i>0 ;i /=10 )
		{
			int rem = i%10;
			sum +=rem;
		}
		System.out.println((sum == dup) ? dup + "  is a neon number" : dup + " is not a neon number.");
	}
}
