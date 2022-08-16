package String;

public class Remove_Duplicates {

	public static void main(String[] args) {
		String s="aaabcdeeef";
		String un="";
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (un.indexOf(ch)==-1) {
				un=un+ch;
			}
		}
		System.out.println(un);
	}	



}


