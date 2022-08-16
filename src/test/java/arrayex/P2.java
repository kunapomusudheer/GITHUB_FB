package arrayex;
import java.util.Scanner;
public class P2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size of array");
	int size=scan.nextInt();
	char[] a=new char[size];
	System.out.println("enter the elements of array");
	for(int i=0;i<size;i++) {
		a[i]=scan.next().charAt(0);
	}
	int count=0;
	for(int i=0;i<size;i++) {
		if((a[i]>='a' && a[i]<='z')||(a[i]>='A' && a[i]<='Z')) {
			switch(a[i]) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':count++;
			}
		}
	}
	System.out.println("the number of vowels are"+count);
}
}
			
				
		