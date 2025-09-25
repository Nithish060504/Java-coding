package comp3;

import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
				
				int n;
				int n1,rem;
				
				int sum=0;
				System.out.println("Enter the Number:");
				n=sc.nextInt();
				n1=n;
				while(n>0){
					
				    rem = n%10;
					sum=sum*10+rem;
					n/=10;
					
				}
				System.out.println(sum);
	}
}