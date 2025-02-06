import java.util.Scanner;

class ProductOfNumber
{
	public static void main(String[] args) 
	{
		int num = 3456;
		
		int rem = num %10 ;		//3456 %10 = 6
		int mul = rem;			//6
		
		num = num /10 ;			//3456 /10 = 345
		rem = num % 10;			//345 %10 = 5
		mul = mul *rem;			// 6*5 =30
		
		num = num /10;			// 345 /10 =34
		rem = num %10;			//34 %10 = 4
		mul *= rem;				//30 * 4 = 120
		
		num = num / 10;			//34 /10 = 3
		rem = num % 10;			//3 % 10 = 3
		mul *= rem;				//120 * 3 = 360
		
		System.out.println(mul);
	}
}
