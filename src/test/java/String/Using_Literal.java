package String;

public class Using_Literal {

	public static void main(String[] args) {
		String s="hyd";
		String s1="hyd";
		String s2="Bng";
//		System.out.println(s==s2);
//		System.out.println(s.equals(s1));
//		System.out.println(s1.equals(s2));
//		System.out.println(s1==s2);
		System.out.println(s1+s2);//temporary
		String str = s1+s2;
		System.out.println(str);//permanent
		s2=s1+s2;
		System.out.println(s2);
       System.out.println(s1==s2);

	}

}
