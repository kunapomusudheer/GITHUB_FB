package String;

public class Replace {

	public static void main(String[] args) {
		String s="KunapomuSudheer";
		System.out.println(s.replace("K", "k"));
		System.out.println(s.replace("S", "t"));
		System.out.println(s.replaceFirst("k", "K"));
		System.out.println(s.replaceAll("Su", "ss"));
		System.out.println(s.replaceAll("[a-z, A-Z]","1"));
		
		
		

	}

}
