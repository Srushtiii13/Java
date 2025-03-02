import java.util.Scanner ; 
class RangeOfArmstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a range : ");
		int range = sc.nextInt();
		for (int i = 1;i<=range ; i++)
		{
			if(isArmstrong(i))
			{
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean isArmstrong(int num)
	{
		int cnt = len(num);
		int sum = 0 ;
		for (int i = num ;i>0 ;i/=10 )
		{
			sum += power(i%10 ,cnt);
		}
		return sum==num ;
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
}
