class Init1
{
	static double pi = 22.0/7.0;

	public static void main(String[] args) 
	{
		areaOfCircle(5);
		circumferenceOfCircle(7);
		
	}

	public static void areaOfCircle(int rad)
	{
		double area = pi*(rad*rad);
		System.out.println(area);
	}

	public static void circumferenceOfCircle(int rad)
	{
		double circum = 2*pi*rad;
		System.out.println(circum);
	}


}