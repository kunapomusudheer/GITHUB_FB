package String;

public class Compareto {

	public static void main(String[] args) {
		String s1="jesus";
		String s2="jesus";
		String s3="Jesus";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s2));
	}

}
