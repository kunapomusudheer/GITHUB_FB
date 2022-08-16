package String;

public class Sbuffer {

	public static void main(String[] args) {
		StringBuffer bfr=new StringBuffer("Sudheer");
      System.out.println(bfr);
      StringBuffer str = bfr.append("kunapomu");
      System.out.println(bfr);
      System.out.println(str==bfr);
      System.out.println(str.equals(bfr));
      
	}

}
