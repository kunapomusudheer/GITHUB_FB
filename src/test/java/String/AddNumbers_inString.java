package String;

public class AddNumbers_inString {

	public static void main(String[] args) {
		// WAP to add numbers presented in String
		//		String s="a11b22c33";
		//		int sum=0;
		//		for (int i = 0; i < s.length(); i++) {
		//			char ch = s.charAt(i);
		//			if (ch>='0'&&ch<='9') {
		//				int n = s.charAt(i)-48;
		//				sum=sum+n;
		//			}

		//		}
		//		System.out.println(sum);
		String s="a11b22c33";
		int sum=0;
		int num=0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>='0'&&ch<='9') {
				int n = s.charAt(i)-48;
				num=num*10+n;

			}
			else {
				sum=sum+num;
				num=0;
			}
		}	
		System.out.println(sum+num);
	}
}

