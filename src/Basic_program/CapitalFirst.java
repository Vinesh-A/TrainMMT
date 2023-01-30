package Basic_program;

public class CapitalFirst{

	public static void main(String[] args) {
		String s="my name is vinesh";
		
		String words[]=s.split(" ");
	        String capS="";
	 
	        for(String word:words){	
	            String firstLetter=word.substring(0,1);
	            String remainingLetters=word.substring(1);
	            capS+=firstLetter.toUpperCase()+remainingLetters+" ";
	        }
	        System.out.println(capS);
		 

		

	}
}
