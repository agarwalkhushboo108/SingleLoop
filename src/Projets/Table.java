package Projets;

import java.util.Scanner;

public class Table 
{
	public static void main(String[] args) 
	{
		int i, table;
		System.out.println("please enter a number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		System.out.println("table of " +num+ " is: ");
	
		for(i=1; i<=10; i++)
		{
			table = num*i;
			System.out.println(+num+ "*" +i+ " = " +table);
		}
	
	}
}
