package comp3;

public class Armstrongnumber {

	public static void main(String[] args) {
		int n=155;
		System.out.println("The number you entered:" +n);
		int n1=n;
		int cube=0;
		while(n>0) {
			int r=n%10;
			cube+=r*r*r; //27
		        
			n/=10;
			
		}
		
         System.out.println("the number after operation:" +cube);
         if(n1==cube) {
        	 System.out.println("its an Armstrong Number");
         }
         else {
        	 System.out.println("Its Not an Armstrong Number");
         }
	}

}
