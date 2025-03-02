import java.util.Scanner;
class DuckNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean flag = false;
		for(int i = num ; i>0; i/=10)
		{
			if(i%10 == 0)
			{
				flag =true;
				System.out.println( num + " is  a Duck number");
				break;
			}
		}
		if(flag == false )
			System.out.println( num + " is not a Duck number");
	}
}
