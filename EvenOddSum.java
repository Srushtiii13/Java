class EvenOddSum 
{
	public static void main(String[] args) 
	{
		int num = 3456;
		int evenSum = 0;
		int oddSum = 0;
		
		int rem = num %10 ;		//3456 %10 =6	
		int sum = (rem % 2 == 0) ? (evenSum += rem) : (oddSum += rem);		//sum = evenSum =6
		
		num = num / 10 ;		//3456 /10 = 345
		rem = num %10 ;		//345 %10 =5	
		sum = (rem % 2 == 0) ? (evenSum += rem) : (oddSum += rem);			//sum = oddSum = 5
		
		num = num / 10 ;		//345 /10 = 34
		rem = num %10 ;		//34 %10 = 4	
		sum = (rem % 2 == 0) ? (evenSum += rem) : (oddSum += rem);			//sum = 6 +4 =10
		
		num = num / 10 ;		//34 /10 = 3
		rem = num %10 ;		//3 %10 = 3	
		sum = (rem % 2 == 0) ? (evenSum += rem) : (oddSum += rem);			//sum = 5 + 3 = 8
		
		
		//System.out.println(sum);
		System.out.println(evenSum);
		System.out.println(oddSum);
	}
}