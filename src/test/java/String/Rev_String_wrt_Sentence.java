package String;

public class Rev_String_wrt_Sentence {

	public static void main(String[] args) {
		//		String s="I am Automation Test engineer";
		//		String[] str = s.split(" ");
		//		for (int i = str.length-1; i >=0; i--) {
		//			System.out.println(str[i]);
		//		}

		//OR .....reverse with temporary variable
		String s="I am Automation Test engineer";
		String[] str = s.split(" ");
		String rev="";
		for (int i = 0; i < str.length; i++) {
			rev=str[i]+" "+rev;
		}
		System.out.println(rev);
	}

}
