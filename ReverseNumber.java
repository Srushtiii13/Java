
class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int num = 5678;
		int dupl = num;
		int rev = 0;
		
		int rem = num % 10;     // rem = 8
		rev = rev * 10 + rem;   //rev= 8
		
		num = num/10 ;			//num =567
		rem = num %10 ;			//rem = 5678%10 7
		rev = rev* 10 + rem;	//rev = 8 * 10 +7 -> 87
		
		num = num /10 ;			//num = 567 /10 -> 56
		rem = num %10 ;			//rem = 56 %10 -> 6
		rev = rev * 10 +rem;	//rev = 87 *10 + 6 -> 876
		
		
		num = num / 10;			//num = 56/10 -> 5
		rem = num %10;			//rem = 5 %10 -> 5
		rev = rev*10 + rem;		//rev = 876 * 10 + 5 - > 8765
		
		System.out.println("The given number is :" + dupl + " and its reverse number is :" + rev);
	}
}
