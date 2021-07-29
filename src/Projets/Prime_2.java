package Projets;

import java.util.Scanner;

public class Prime_2 
{
	public static void main(String[] args) 
	{
		int i, prime=1;
		System.out.println("please enter a number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for(i=2; i<num; i++)
		{
			if((num % i) == 0) 
			{
		         prime = 0;
		    }
			
		}
		      
		if(prime==1)
		{
			System.out.println(+num+ " is a prime number");
		}
		else
		{
			System.out.println(+num+ " is not a prime number");
		}
	
	}
}
