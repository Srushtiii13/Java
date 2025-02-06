class ConditionalOp 
{
	public static void main(String[] args) 
	{
		int a = 65;
		int b = 89;
		int c = 9887;
		int lar = (a > b) ? ((a > c) ? (a) : (c) ) : ((b > c) ? (b) : (c));
		System.out.println("Largest :" + lar);
	}
}
