import java.util.Scanner ;
class RotateNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int ip = sc.nextInt();
		int rot = rotate(ip);
		do
		{
			System.out.println(rot);
			rot = rotate(rot);
		}
		while (rot!= ip);	
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
}
