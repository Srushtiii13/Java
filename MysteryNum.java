import java.util.Scanner;
class MysteryNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num :");
		int num = sc.nextInt();
		int num1 = 0;
		int num2 = 0 ;
		if(num%11==0)
		{
			int quo = num/11;
			
			for (int a= 0 , b = quo ; a <= quo && b>0  ; a++ , b-- )
			{
				if(a+b==quo)
				{
					num1 = (a*10)+b;
					num2 = (b*10) + a;
				}
			}
		}
		System.out.println(num1);
		System.out.println(num2);
	}
}
