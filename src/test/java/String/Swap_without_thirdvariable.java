package String;

public class Swap_without_thirdvariable {

	public static void main(String[] args) {
		// WAP to swap without 3rd variable
		String s="welcome";
		String s1="hyderabad";
		s=s+s1;//welcomehyderabad
		s1=s.substring(0, s.length()-s1.length());//16-9===(0,7)
		s=s.substring(s1.length());
		System.out.println(s+"\n"+s1);
	}

}
