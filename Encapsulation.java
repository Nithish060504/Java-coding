package comp3;
import java.io.*;
class bank {
	 private int minimumBalance=2500;

public int getminimumBalance() {     //method to print value
	
	return minimumBalance;
}
public void setminimumBalance(int value) {  //method to set value 
	this.minimumBalance=value;
	System.out.println(minimumBalance);
}
}
public class Encapsulation {

	public static void main(String[] args) {
		
     bank b=new bank();
     int min=b.getminimumBalance();
     System.out.println(min);
     b.setminimumBalance(10000);
	}

}
