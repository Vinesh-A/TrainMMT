package Basic_program;

public class Palindrome {
   public static void Palindrome() {
	int a=12321;
	int temp=a;
	int rev=0;

	while(a>0) {
		int rem=a%10;
		    rev=(rev*10)+rem;
		    a=a/10;
	}
	if (temp==rev) {
		System.out.println("Its a Palindrome");
	} else {
		System.out.println("Its not a palindrome");
	} 
	}
public static void main(String[] args) {
	Palindrome();
	}

}
