package comp3;

public class PerfectNumber {

	public static void main(String[] args) {
		int n=6;
		int sum=0;
		for(int i=1;i<n/2;i++) {
			if(n%i==0) {
				sum+=i;
				
			}
		}
		System.out.println(sum);
		if(n==sum) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a perfect number");
		}
	}

}
