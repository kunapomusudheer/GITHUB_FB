package arrayex;

public class DuplicatesOf_array {

	public static void main(String[] args) {
		int a[]= {1,2,4,3,4,2,5,1};
		for (int i = 0; i < a.length-1; i++) {
			for (int j =i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[i]);	
				}	
			}
		}

	}
}