package String;

public class Reverse_wrt_Same_position {

	public static void main(String[] args) {
		//reverse a string within the same position
		String s="katam ta ta bye bye";
		String[] str = s.split(" ");//["katam","ta","ta","bye","bye"]
		for (int i = 0; i < str.length; i++) {
			String strarray = str[i];
			String rev="";
			//			for (int j = strarray.length()-1; j >=0; j--) {
			//			rev=rev+strarray.charAt(j);
			//}
			for (int j =0; j <strarray.length(); j++) {
				rev=strarray.charAt(j)+rev;

			}
			System.out.print(rev);
		}

	}
}