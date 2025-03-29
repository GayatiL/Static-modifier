class MethodOverloading
{
	public static void main(String[] args) 
	{

		add(10,20);
		add(12.3 , 123.3);

		add(40, 60 , 100);
		
	}

	public static void add(int a, int b)
	{
		System.out.println("addtion is : "+(a+b));
	}

	public static void add(float a, float b)
	{
		System.out.println("addtion is : "+(a+b));
	}

	public static void add(double a, double b)
	{
		System.out.println("addtion is : "+(a+b));
	}

	public static void add(long a, long b)
	{
		System.out.println("addtion is : "+(a+b));
	}

	public static void add(short a, short b)
	{
		System.out.println("addtion is : "+(a+b));
	}

	public static void add(int a, int b,int c)
	{
		System.out.println("addtion is : "+(a+b+c));
	}
}