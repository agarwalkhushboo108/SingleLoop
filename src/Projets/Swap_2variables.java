package Projets;

import java.util.Scanner;

public class Swap_2variables 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter value of x and y");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		
		System.out.println("Numbers before swapping : " +x+" " +y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Numbers after swapping : " +x+" " +y);
	}
}
