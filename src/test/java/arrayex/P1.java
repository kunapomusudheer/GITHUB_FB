package arrayex;
import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=scan.nextInt();
		int[] a=new int[size];
		System.out.println("enter the elements of array");
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		int[] a1=new int[size];
	   for(int i=0;i<size;i++) {
		   a1[i]=a[i];
	   }
		   System.out.println("the elements of new array is:");
		   System.out.print("[");
		   for(int b:a1) {
			   System.out.print(b+ "");
		   }
	
		System.out.println("]");	
		}
		
		
	}
	

