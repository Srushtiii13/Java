import java.util.Scanner;
class SphenicNum
{
	public static void main(String[] args) 
	{
		System.out.print(" Enter the number : ");
		int num = new Scanner(System.in).nextInt();
		int prod=1;
		for (int i = 2 ;i<=num/2  ;i++ )
		{
			if(num % i == 0)
			{
				boolean flag = true;
				for (int j = 2 ;j<i ;j++ )
				{
					if(i%j ==0){
						flag = false;
						break;}
				}
				if(flag)
				{
					prod*=i;
				}
			}
		}
		if(num==prod)
			System.out.println(" Sphenic No.");
		else 
			System.out.println(" Not a Sphenic No.");
	}
}
