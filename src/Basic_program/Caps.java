package Basic_program;

public class Caps {
	public static void main(String[] args) {
		String s = "vinesh is a good boy"; 
	  String[] words = s.split(" ");	
		 for (String x : words)
	        {
			 String firstLetter = x.substring(0,1);
		        String remainingLetters = x.substring(1);
		       String firstLetterCaps = firstLetter.toUpperCase(); 
		        System.out.print(firstLetterCaps +remainingLetters+" ");
	        }
	}
} 
