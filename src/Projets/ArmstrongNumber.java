package Projets;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int n,
		sum=0, num, r;
		Scanner s= new Scanner(System.in);
		System.out.println("please enter a number");
		n = s.nextInt();
		
		num=n;
		while(num>0)
		{
			r=num%10;
			sum = sum+(r*r*r);
			num=num/10;
			
		}
		if(n==sum)
		{
			System.out.println("this is armstrong number");
		}
		else
		{
			System.out.println("this is not armstrong number");
		}
		
	}
}
