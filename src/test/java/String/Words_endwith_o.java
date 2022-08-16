package String;

public class Words_endwith_o {

	public static void main(String[] args) {
		// WAP to print words ending with o
		String s="hello who are you";
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
        	//String s2 = str[i];
			if (str[i].contains("o")) {
				System.out.println(str[i]);
			}
		}
	}

}
