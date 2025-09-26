package comp3;
class sorted{
	
}
public class SortedOrNot {

	public static void main(String[] args) {
		
		
		int arr[]= {1,4,6,8};
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				System.out.println("not Sorted");
				return;
			} 
			
			
		}
		System.out.println("sorted");
	}

}
