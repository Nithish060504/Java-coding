package comp3;

public class AbsoluteDifference {

	public static void main(String[] args) {
		int arr[]= {1,4,5,6};
		int odd=0 ,even=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even+=arr[i];
			}
			else {
				odd+=arr[i];
			}
		}
		
		int sum=even-odd;
		if(sum<0) {
			sum=-sum;
		}
		System.out.println("Absolute Difference is:"+sum);
	}

}
