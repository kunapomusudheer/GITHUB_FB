package String;

public class Reverse_without_Lengthmethod {

	public static void main(String[] args) {
		String s="Automation";
		char[] charr = s.toCharArray();//[A,u,t,o,m,a,t,i,o,n]
		int count=0;
		for (char c : charr) {
			count++;
		}
		for (int i = count-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}
