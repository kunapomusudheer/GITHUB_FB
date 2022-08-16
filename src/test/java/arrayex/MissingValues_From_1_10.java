package arrayex;

public class MissingValues_From_1_10 {
	public static void main(String[] args) {
		boolean status=true;
		int a[]= {1,8,3,7};
		for (int i = 1; i <=10; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i==a[j]) {
					status=false;
					break;
				}
			}
			if (status==true) {
				System.out.print(i+ " ");
			}
			status=true;
		}
	}
}
