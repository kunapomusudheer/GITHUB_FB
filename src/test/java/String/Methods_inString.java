package String;

public class Methods_inString {

	public static void main(String[] args) {
		String s="Automation";
		String s1="Manula Testing";
		String s2="automation";
		//length method
		System.out.println(s.length());
		System.out.println(s1.length());
		//char at ()....fetching particular char
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(9));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		//trim method
		String s3="           Automation  manual Testing";
		System.out.println(s3.trim());
		String s4="Automation manual Testing";
		//substring
		System.out.println(s4.substring(0));
		System.out.println(s4.substring(2, 9));
		
		//Indexof method
		System.out.println(s4.indexOf('a'));
		System.out.println(s4.indexOf(s4));
		System.out.println(s4.indexOf('a', 10));
		System.out.println(s4.indexOf("ma", 0));
		System.out.println(s4.indexOf("Ma", 0));
		
		//toUpperCase, to LowerCase
		System.out.println(s4.toUpperCase());
		System.out.println(s4.toLowerCase());
		
		//startsWith
		System.out.println(s4.startsWith("A"));
		System.out.println(s4.startsWith("G"));

		//Contains method
		System.out.println(s4.contains("A"));
		System.out.println(s4.contains("ti"));
		System.out.println(s4.contains(" "));
		
		//isEmpty
		System.out.println(s4.isEmpty());
		
		//isBlank
		//System.out.println(s4.isBlank());
		
		
				
	
		}
}
