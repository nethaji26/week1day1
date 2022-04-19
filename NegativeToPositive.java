package week1.day1;

import java.util.Scanner;

public class NegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println(" Enter the number");
		int num = in.nextInt();
		//To convert to positive number
		int positivenumber = num *-1;
		System.out.println(" The converted positive number is " +positivenumber);
		

	}

}
