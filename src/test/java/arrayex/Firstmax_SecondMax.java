package arrayex;

import java.util.Scanner;

public class Firstmax_SecondMax {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		int fmax=a[0];
		int smax=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>fmax) {
				smax=fmax;
				fmax=a[i];
			}
			else if (a[i]>smax) {
				smax=a[i];
			}
		}
		System.out.println("The first and second max are" +fmax +" and " + smax );
	}

}
