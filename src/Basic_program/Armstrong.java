package Basic_program;

public class Armstrong {
	public static void Armstrong() {
		int a=371;
		int temp=a;
		int sum=0;
		while(a>0) {
			int rem=a%10;
			sum=sum+(rem*rem*rem);
			a=a/10;
		}
		if(temp==sum) {
			System.out.println("Its an Armstrong Number");
		}else {
			System.out.println("Its not an Armstrong Number");
		}
		
	}
      public static void main(String[] args) {
		Armstrong();
	}
}
