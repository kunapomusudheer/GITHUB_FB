package String;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		String s="Jesus is my saviour";
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println(Arrays.toString(str));
		String s1="Jesus is my saviour";
		String[] str1 = s1.split(" ", 2);
		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}

	}
		
}
