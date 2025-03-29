class StatVar3
{
	static String s ;

	public static void main(String[] args) 
	{
		System.out.println(s);

		demo();

		String s = "lande";

		System.out.println(s);
		System.out.println(StatVar3.s);


		
	}

	public static void demo()
	{
		System.out.println("this is demo method");

		s = "gayatri";
	}
}

