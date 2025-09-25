package comp3;

public class BinaryOnes {

	public static void main(String[] args) {
		int n=11;
		
		int count=0;
		while(n>0) {
			int rem=n%2;     //1 0 1
			n/=2; 
			if(rem==1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
