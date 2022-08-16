package String;

public class Intialzing_Declaration_Withnew {

	public static void main(String[] args) {
		String s=new String("Hyderabad");
		String s1=new String("Hyderabad");
		System.out.println(s.equals(s1));//true bcz it compares properties
		System.out.println(s==s1);//false bcz it compares addresses
		String s2=new String("Bangalore");
		System.out.println(s==s2);//false
		System.out.println(s.equals(s2));//false
		System.out.println(s+s2);//temporary change
	}

}
