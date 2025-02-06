import java.util.Scanner;
class GameSPS 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int random =  0;
		for( ;  ; )
		{
			
			int num = (int)(Math.random()*10);
			if(num>= 1 && num <= 3)
			{
				random = num;	
				break;		//if we find a digit between 1 to 3 we terminate the program
			}
		}
		
		String codeOpt = null;
		if(random == 1)
		{
			codeOpt = "STONE";
		}
		
		else if(random ==2)
		{
			codeOpt = "PAPER";
		}
		else 
		{
			codeOpt = "SCISSOR";
			
		}
		
		System.out.println();
	    System.out.println("		WELCOME");
		System.out.println();
		System.out.println("1.STONE  2.PAPER  3.SCISSOR ");
		System.out.print("Enter the option : ");
		int opt = sc.nextInt();
		String userOpt = null;
		
		 if(opt ==1)
		{
			userOpt = "STONE";
		}
		else if(opt ==2)
		{
			userOpt = "PAPER";
		}
		else if(opt == 3)
		{
			userOpt = "SCISSOR";
		}
		else
		{
			System.out.println("INVALID OUTPUT");
			return;				//if invalid output terminate the execution
		}
		
		System.out.println("User : " + userOpt + "  Machine : " + codeOpt);
		if((opt ==1 && random ==3) || (opt ==2 && random ==1) || (opt == 1 && random ==2))
		{
			System.out.println("User has WON");
		}
		else if((opt ==1 && random ==2) || (opt ==2 && random==3) || (opt ==3 && random ==1))
		{
			System.out.println("Machine has WON");
		}
		else
		{
			System.out.println("DRAWS");
		}
		
	}
}
