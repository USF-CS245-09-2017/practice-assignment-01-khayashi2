class Fibonacci
{
	public Fibonacci()
	{

	}

	public int fibonacci (int n, String type)
	{
		if(type.equals("iterative"))
		{
			return fibonacci_iterative(n);
		}

		return fibonacci_recursive(n);
	}

	public int fibonacci_recursive(int n)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}

		return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
	}


	public int fibonacci_iterative(int n)
	{
		int swap = 0, a1 = 1, a2 = 1;
        for (int i = 0; i < n; i++) 
        {
            swap = a1;
            a1 = a2;
            a2 = swap + a1;
        }
        return swap;
	}
}
