class StatVar2
{
	static double balance;
	
	public static void main(String[] args) 
	{
		credit(5000);
		debit(1000);

		
	}

	public static void credit(double bal)
	{
		if(bal>0)
		{
			balance+=bal;
			System.out.println("Amout is credited");
			System.out.println("your current balance is "+balance);
		}
		else 
		{
			System.out.println("invalid amount ");

		}
	}
	public static void debit(double bal)
	{
		if(bal>0 && balance-bal>1000)
			{
				balance-=bal;
				System.out.println("amount has been debited");
				System.out.println(" your current balance is "+balance);
			}

		else 
		{
			System.out.println("invalid amount");
		}
	}



}