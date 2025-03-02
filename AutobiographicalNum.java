import java.util.Scanner;
class AutobiographicalNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int len = 0;
		
		for (int i = num ;i>0  ;i/=10 )
		{
			sum+=(i%10);
			len++;
		}
		if(len == sum)
			System.out.println(num + " is a autobiographical number ");
		else
			System.out.println(num + " is not a autobiographical number ");
	}
}
