import java.util.Scanner;
class SumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;
		
		while(num>0)
		{
			int rem = num %10;
			sum+=rem;
			num /= 10;
			
		}
		
		System.out.println(sum);
		System.out.println(dup);
	}
}
