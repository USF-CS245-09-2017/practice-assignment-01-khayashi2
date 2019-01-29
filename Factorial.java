class Factorial
{
	public Factorial()
	{

	}

	public int factorial (int n, String type)
	{
		if(type.equals("iterative"))
		{
			return Factorial_iterative(n);
		}

		return Factorial_recursive(n);
	}

	public int Factorial_recursive(int n)
	{
		if(n==1)
		{
			return 1;
		}

		return n*Factorial_recursive(n-1);


	}


	public int Factorial_iterative(int n)
	{
		int sum = 1;
		for ( int i=1; i<=n; i++ )
		{
			sum *= i;
		}
   
		return sum;
	}

}