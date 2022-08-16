package String;

public class TocharArray {

	public static void main(String[] args) {
		String s="Jesus is my saviour";
		char[] str = s.toCharArray();
		int count=0;
		for (int i = 0; i < str.length; i++) {
			count++;
			System.out.print(str[i]);
			System.out.print(" ");
		}
		//System.out.println(count);
	}

}
