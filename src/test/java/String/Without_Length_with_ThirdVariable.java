package String;

public class Without_Length_with_ThirdVariable {

	public static void main(String[] args) {
		String s="Automation";
		String rev="";
		char[] charr = s.toCharArray();
		int	count =0;
		for (char c : charr) {
			count++;
		}
		for (int i = count-1; i >=0; i--) {
			rev=rev+s.charAt(i);

		}
		System.out.println(rev);
	}

}
