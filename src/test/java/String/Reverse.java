package String;

public class Reverse {

	public static void main(String[] args) {
//		String s="Automation";
//		for (int i = s.length()-1; i >=0; i--) {
//			System.out.print(s.charAt(i)+ " ");
//		}
		
		// First.....................................OR
//		String s="Automation";
//		String rev="";
//		for (int i = 0; i < s.length(); i++) {
//			rev=s.charAt(i)+rev;
//			
//		}
//		System.out.print(rev);
		
		// Second................................OR
		String s="Automation";
		String rev="";
		for (int i =s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.print(rev);
	}
	}


