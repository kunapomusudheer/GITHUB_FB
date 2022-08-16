package arrayex;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder_Array {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

		}
		System.out.println("the ascending order is"+Arrays.toString(a));
	}

}
