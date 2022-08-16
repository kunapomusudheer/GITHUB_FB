package arrayex;

import java.util.Arrays;
import java.util.Scanner;

public class reverse_Array {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		int start=0;
		int end=a.length-1;
		for (int i = 0; i < a.length; i++) {
			if(start<end) {
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
