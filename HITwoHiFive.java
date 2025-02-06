import java.util.Scanner;
class HiTwoHiFive 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		
		String op = (num %2 == 0 && num%5 ==0) ? ( "HiTwoHiFive") : 
			((num % 5==0) ? ( "Hifive" ) :((num %2 == 0 )?("HiTwo"):(" ")));
		System.out.println(op);
	}
}
