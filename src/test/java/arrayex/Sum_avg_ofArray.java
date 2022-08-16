package arrayex;

import java.util.Scanner;

public class Sum_avg_ofArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements of array");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();

		}
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("The sum of array"+sum);
		double avg=sum/a.length;
		System.out.println("The average of array"+avg);
	}

}


