package arrayex;

import java.util.Scanner;

public class Print_First_last_cvalues {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements of array");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();

		}
		System.out.println("the first value is"+a[0]);
		System.out.println("the last value is"+a[a.length-1]);

	}
}
