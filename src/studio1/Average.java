package studio1;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("the fist of two integers to averaged");
		int n1 = in.nextInt();
		System.out.println("the second of two integers to averaged");
		int n2 = in.nextInt();
		System.out.println("the average of the two values is " + ((double)(n1+n2)/2));
	}

}
