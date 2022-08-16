package String;

import java.util.Arrays;

public class Swapping {

	public static void main(String[] args) {
		// wap to swapping
		String s= "welcome,to,testyantra,hyderabad";

		String[] str = s.split(",");
		String temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		//System.out.println(Arrays.toString());
		for (int i= 0; i<str.length ; i++) {
			System.out.print(str[i]+" ");
		}
	}
}