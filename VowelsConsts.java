import java.util.Scanner;
class VowelsConsts
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch = sc.next().charAt(0);
		String op = 
			( ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch =='E' || ch == 'I' || ch == 'O' || ch == 'U' )? (ch + " is a vowel") : ( ch + " is a consonant.");
		System.out.println(op);
	}
}
