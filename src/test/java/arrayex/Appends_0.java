package arrayex;

import java.util.Arrays;

public class Appends_0 {

	public static void main(String[] args) {
		int a[]= {1,0,0,1,0,0,1,0,1};
		int b[]= new int[a.length];
		int start=0;
		int end=a.length-1;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==0) {
				b[start]=a[i];
				start++;
			}
			else {
				b[end]=a[i];
				end--;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
