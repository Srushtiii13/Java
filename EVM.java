import java.util.Scanner;
class EVM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("					WELCOME");
		System.out.println();
		System.out.print("Enter the population : ");
		int pop = sc.nextInt();
		int bjp =0, cng = 0 , ss = 0 , aap = 0, mns = 0, nota = 0;
		for( int i =1 ; i <= pop ; i++)
		{
			System.out.println("*** LIST OF CANDIDATES***");
			System.out.println("1.BJP");
			System.out.println("2.CONGRESS");
			System.out.println("3.SHIV SENA");
			System.out.println("4.AAP");
			System.out.println("5.MNS");
			System.out.println("6.NOTA");
			System.out.println("Enter the option :");
			int opt = sc.nextInt();
			
			if( opt==1)
			{
				bjp++;
				System.out.println("ACCHE DIN AYENGE");
			}
			
			if( opt==2)
			{
				cng++;
				System.out.println("BHARAT TODO");
			}
			
			if( opt==3)
			{
				ss++;
				System.out.println("HUM HAI ASLI SENA");
			}
			
			if( opt==4)
			{
				aap++;
				System.out.println("MUJHE AZAD KARO");
			}
			
			if( opt==5)
			{
				mns++;
				System.out.println("JAI MAHARASHTRA");
			}
			
			if( opt==6)
			{
				nota++;
				System.out.println("YOU ARE A EDUCATED PERSON");
			}
			if(!(opt >=1 && opt<=6))
			{
				i--;
				System.out.print("INVALID OPTION");
			}
		}
		if( bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
		{
			System.out.println("BJP HAS WON");
			return;
		}
		
		if( cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota)
		{
			System.out.println("CONGRESS HAS WON");
			return;
		}
		
		if( ss>=bjp && ss>=cng && ss>=aap && ss>=mns && ss>=nota)
		{
			System.out.println("SHIV SENA HAS WON");
			return;
		}
		
		if( aap>=cng && aap>=ss && aap>=bjp && aap>=mns && aap>=nota)
		{
			System.out.println("AAP HAS WON");
			return;
		}
		
		if( mns>=cng && mns>=ss && mns>=aap && mns>=bjp && mns>=nota)
		{
			System.out.println("MNS HAS WON");
			return;
		}
		
		if( nota>=cng && nota>=ss && nota>=bjp && nota>=mns && nota>=aap)
		{
			System.out.println("NO ONE HAS WON");
			return;
		}
		
		
	}
}
