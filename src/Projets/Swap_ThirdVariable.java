package Projets;

import java.util.Scanner;

public class Swap_ThirdVariable 
{
	public static void main(String[] args) 
	{
		int t;
		System.out.println("Please enter value of x");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		System.out.println("Please enter value of y");
		int y = s.nextInt();
		
		System.out.println("Numbers before swapping : " +x+" " +y);
		
		t=x;
		x=y;
		y=t;
		
		System.out.println("Numbers after swapping : " +x+" " +y);
	}

}
