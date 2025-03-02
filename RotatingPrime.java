import java.util.Scanner ;
class RotatingPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int ip = sc.nextInt();
		int rot = rotate(ip);
		boolean flag = true;
		do
		{
			System.out.println(rot);
			if(!isPrime(rot))
			{
				flag = false;
				break;
			}
			
			rot = rotate(rot);
		}
		while (rot!= ip);
		
		
		System.out.println(flag ? ip + " is Roatating Prime." : ip+ " is not a rotating prime number.");
		
		
	}
	
	public static int rotate(int num)
	{
		return(num%10)*(power (10, (len(num)-1)))+(num/=10);
	}
	public static int len(int num)
	{
		int cnt = 0;
		while(num>0)
		{
			num/=10;
			cnt++;
		}
		return cnt;
	}
	
	public static int power(int num,int power)
	{
		int num1=1;
		
		for (int i = 1; i<=power ;i++ )
		{
			num1*=num;
		}
		return num1;
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
