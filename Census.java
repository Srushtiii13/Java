class Census 
{
	public static void main(String[] args) 
	{
		final long currentPop = 312032486;
		int seconds = ( 365*24*60*60 )*5;
		int birth = seconds/7;
		int death = seconds/13;
		int immg = seconds/45;
		
		int newPop = currentPop + birth - death + immg;
		System.out.println("Current Population is :" + currentPop);
		System.out.println("New Population is :" + newPop);
	}
}
