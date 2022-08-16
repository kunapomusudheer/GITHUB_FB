package arrayex;

public class P4 {

	public static void main(String[] args) {
		char[] ch= {'a','b','c','d'};
		
		String obj=new String(ch);
		System.out.println(obj);
		String obj1=new String("abcd");
		System.out.println(obj1);
		System.out.println(obj==obj1);
		System.out.println(obj.equals(obj1));
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		

	}

}
