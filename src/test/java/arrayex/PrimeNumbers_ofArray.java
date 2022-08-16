package arrayex;

public class PrimeNumbers_ofArray {

	public static void main(String[] args) {
		String primenum="";
		int a[]= {3,7,10,66,4,6};

		for (int i = 0; i <a.length; i++) {
			int count=0;
			int num=a[i];
			for (int j = 2; j<num; j++) {
				if(num%j==0) {
					count=1;
				}

			}
			if(count==0) {
				primenum=primenum+a[i]+" ";
			}
		}
		System.out.println(primenum);
	}
}
