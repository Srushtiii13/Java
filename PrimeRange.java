import java.util.Scanner;
class PrimeRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a start point : ");
		int start = sc.nextInt();
		System.out.println("Enter a end point : ");
		int end= sc.nextInt();
		
		for(int i = start ; i <= end ; i++)
		{
			if(i%2==0 || i%3 ==0 || i%5==0 ||i%7 ==0)
			{
				break;
			}
			
			else
			{
				System.out.print(i + " ");
			}
		}
	}
}
