package String;

public class Count {

	public static void main(String[] args) {
		String[] s= {"raman","irfan","sudheer","nagamani"};
		
		for (int i = 0; i < s.length; i++) {
			String s1 = s[i];
			int count=0;
			for (int j = 0; j < s1.length(); j++) {
				char ch = s1.charAt(j);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
			System.out.println(s1+""+count);
		}
	}
}