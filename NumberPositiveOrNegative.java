package week1.day1;

import java.util.Scanner;

public class NumberPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println(" Enter the number");
		int number = in.nextInt();
		if(number>0)
		{
			System.out.println(" The number is positive");
		}
		else if ( number<0)
		{
			System.out.println(" The  number is negative");
		}
		else
		{
			System.out.println(" The number is 0");
		}

	}

}
