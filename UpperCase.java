import java.util.Scanner;
class UpperCase

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character :");
		char ch = sc.next().charAt(0);
		
		
		System.out.println(( ch >= 65 && ch <=90 ) ? (ch + " is upper case character") : ( ch + "  is not a upper case character"));
	}
}
