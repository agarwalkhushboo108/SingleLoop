package Projets;

import java.util.Scanner;

public class FactorialNumber 
{
	public static void main(String[] args) 
	{
		int n, i,fact=1;
		System.out.println("please enter a number");
		Scanner s= new Scanner(System.in);
		n = s.nextInt();
		
		for(i=1; i<=n; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of " +n+ " is: " +fact);
	
	}
}
