package arrayex;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=scan.nextInt();
		int[] a=new int[size];
		System.out.println("enter the elements of array");
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		int max=0;
		for(int i=0;i<size;i++) {
			if(max< a[i]) {
				max=a[i];
				}
		}
		System.out.println("the max element of array is "+max);
	}

}
