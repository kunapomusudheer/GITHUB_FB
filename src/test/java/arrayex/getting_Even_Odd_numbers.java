package arrayex;

import java.util.Scanner;

public class getting_Even_Odd_numbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		int evensum=0;
		int oddsum=0;
		for (int i = 0; i < a.length; i++) {
			if(i%2==0) {
				evensum=evensum+a[i];
			}
			else {
				oddsum=oddsum+a[i];
			}
		}
			System.out.println("the sum of even position numbers is" + evensum);
			System.out.println("the sum of odd position numbers is" + oddsum);

		
	}

}
