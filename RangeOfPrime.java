import java.util.Scanner ; 
class RangeOfPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range : ");
		int range = sc.nextInt();
		for (int i = 1 ;i<=range ; i++ )
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean isPrime(int num)
	{
		int den = 2;
		for ( ;den<num ;den++)
		{
			if(num%den ==0)
			{
				break;
			}
		}
		return num==den;
	}
}
