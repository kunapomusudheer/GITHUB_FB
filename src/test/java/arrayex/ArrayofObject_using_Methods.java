package arrayex;

public class ArrayofObject_using_Methods {
	String name;
	String designation;
	long sal;

	public ArrayofObject_using_Methods(String name, String designation, long sal) {
		super();
		this.name = name;
		this.designation = designation;
		this.sal = sal;
	}
	public static void display(ArrayofObject_using_Methods[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i].name+" "+str[i].designation+" "+str[i].sal);
		}
	}
	public static void main(String[] args) {
		ArrayofObject_using_Methods str []=new ArrayofObject_using_Methods[2];
		str [0]=new ArrayofObject_using_Methods("Sudheer", "ceo", 1000000000);
		str [1]=new ArrayofObject_using_Methods("amear", "TL", 100000000);
		//				for (int i = 0; i < str.length; i++) {
		//					System.out.println(str[i].name+" "+str[i].designation+" "+str[i].sal);
		display(str );

	}



}


