package String;

public class Initcap_method {

	public static void main(String[] args) {
		// Intial capital program
		String s="welcome to india";
		String[] str = s.split(" ");
		String allLetters="";
		for (String s1 : str) {
			String firstLetter = s1.substring(0, 1).toUpperCase();
			String remainingLetters = s1.substring(1);
			allLetters=allLetters+" "+firstLetter+remainingLetters;
		}
		System.out.println(allLetters);
	}

}


