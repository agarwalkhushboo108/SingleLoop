package Projets;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("please enter a number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if(isPrime(num))
		{
			System.out.println("number is prime");
		}
		else 
		{
			System.out.println("number is not prime");
		}
	}

	public static boolean isPrime(int num)
	{
		if(num<=1) 
			{
			System.out.println("1 is neither prime nor composite");
			return false;
			}
		for(int i=2; i<num; i++)
		{
			if(num%i==0) 
			{
				return false;
			}
		}
		
		return true;
	}
}
