package arrayex;

import java.util.Scanner;

public class Duplicate_First_Second_min {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		int fmin=a[0];
		int smin=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<=fmin && a[i]!=fmin ) {
				smin=fmin;
				fmin=a[i];
			}
			else if (a[i]<smin || fmin==smin) {
				smin=a[i];
			}
		}
		System.out.println("The first and second min values are " + fmin+ " "+ smin);
	}
}

