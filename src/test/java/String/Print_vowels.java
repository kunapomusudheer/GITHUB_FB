package String;

public class Print_vowels {

	public static void main(String[] args) {
		//		String s="Automation";
		//		String str=s.toLowerCase();
		//		for (int i = 0; i < str.length(); i++) {
		//			char ch = str.charAt(i);
		//			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		//				System.out.println(ch);
		//			}

		//}
		String s="Automation";
		String str=s.toLowerCase();
		char[] charr = str.toCharArray();
		for (int i = 0; i < charr.length; i++) {
			
			if (charr[i]=='a'||charr[i]=='e'||charr[i]=='i'||charr[i]=='o'||charr[i]=='u') {
				System.out.println(charr[i]);
			}
		}

	}
}
