package Projets;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		int r, sum=0, t;
		System.out.println("please enter a number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		t=num;
		
		while(num>0)
		{
			r=num%10;
			sum = (sum*10)+r;
			num=num/10;
		}
		
		if(t==sum)
		{
			System.out.println("given number is a palindrome number");
		}
		else
		{
			System.out.println("given number is not a palindrome number");
		}
	}
}
