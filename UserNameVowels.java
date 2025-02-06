import java.util.Scanner;
class UserNameVowels 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = sc.nextLine().toUpperCase();
		int len = name.length();
		
		for(int i =0; i <= (len-1); i++)
		{
			if(name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O' || name.charAt(i) == 'U')
			System.out.println(name.charAt(i));
		}
	}
}
