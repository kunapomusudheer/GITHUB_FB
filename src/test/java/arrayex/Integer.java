package arrayex;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an String");
		int size=sc.nextInt();
		String a[]=new String [size];
		System.err.println(a.length);
		System.out.println("enter the string values");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.next();
			}
          for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}

}
