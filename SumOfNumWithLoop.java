import java.util.Scanner;
class SumOfNumWithLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number  ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;
		while(num>0)
		{
			int rem = num%10;		//gives last digit
			sum += rem;
			num /=10;
		}
		System.out.println("Sum of number " + dup + " is : " + sum);
	}
}
