package Basic_program;

public class Basic {

	int a=29;
	
	String b="Vinesh";

	private void Age() {
		//int a = 29;
		System.out.println(a);
	}

	private void Student() {
		//String b = "Vinesh";
		System.out.println(b);
	}

	public static void main(String[] args) {

		Basic ref = new Basic();
		ref.Student();
		ref.Age();
		
		
		
	}

}
