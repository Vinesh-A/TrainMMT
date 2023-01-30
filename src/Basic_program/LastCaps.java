package Basic_program;

public class LastCaps {

	public static void main(String[] args) {
		String s = "java";
		String temp = "";
		String str[] = s.split(" ");
		for (String s1 : str) {
			for (int i = 0; i < s1.length(); i++) {
				if (i == 0 || i == s1.length() - 1) {
					temp += String.valueOf(s1.charAt(i)).toUpperCase();
				} else {
					temp += s1.charAt(i);
				}
			}
		}
		System.out.println(temp);

	}
	
	
	

}
