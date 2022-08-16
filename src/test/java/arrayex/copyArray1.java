package arrayex;

import java.util.Arrays;
import java.util.Scanner;

public class copyArray1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("the values of a array are" + Arrays.toString(a));
		int b[]=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
		}
		System.out.println("the values of b4 array are" + Arrays.toString(b));
	
	}
}