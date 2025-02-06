import java.util.Scanner;

class ProductOfNumbers 
{
	public static void main(String[] args) 
	{
		int num = 3456;
		
		int rem = num %10 ;		//3456 %10 = 6
		int mul = rem;			//6
		
		num = num /10 ;			//3456 /10 = 345
		rem = num % 10;			//345 %10 = 5
		mul = mul *rem;			// 
		
		
		
		
		
		
		
		System.out.println(mul);
	}
}
