package comp3;

public class AscAndDesSorted {

	public static void main(String[] args) {
		int arr[]= {8,9,4,2};
		boolean asc=true;
		boolean des=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {  
				des=false;  // 8<9   true --->des-false
			}
			if(arr[i]>arr[i+1]) {  
				asc=false;
			}
		}
          if(asc) {
        	  System.out.println("Sorted in ascending");
        	  
          }
          else if(des) {
        	  System.out.println("Sorted in descending");
          }
          else {
        	  System.out.println("Not sorted");
          }
	}

}
