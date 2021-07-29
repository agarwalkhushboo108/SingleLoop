package Projets;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int next, i, n=12, n1=0, n2=1;
		System.out.println("Fibonacci Series till " +n+ " terms: ");
		
		for(i=1; i<=n; i++)
		{
			System.out.print(+n1+ ", ");
			
			next = n1+n2;
			n1=n2;
			n2=next;
		}
	}
}
