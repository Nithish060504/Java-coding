package comp3;

public class Sumofdigits {

	public static void main(String[] args) {
		int n=123;
		int rem;
		int sum=0;
		while(n>0) {
			 rem=n%10; // 3  2  1 
			 sum+=rem;
			 n/=10;
		}
   System.out.println(sum);
	}

}
