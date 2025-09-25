package comp3;
import java.util.Scanner;
public class MenuCard {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Menu Card:");
	System.out.println("1.Coffee   Rs.15 \n"
			+"2.Tea     Rs.10\n"
			+ "3.Cold Coffee  Rs.25\n"
			+ "4.Milkshake      Rs.50");
	
	System.out.println("Enter your Choice:");
	int ch=s.nextInt();
	for(int i=0;i<=10;i++) {
	switch(ch) {
	case 1: {
		System.out.println("you are selected coffee");
		System.out.println("Enter the quantity:");
		int q=s.nextInt();
		int a=15*q;
		System.out.println("Total amount:" +a);
		break;
		
	}
	case 2: {
		System.out.println("you are selected tea");
		System.out.println("Enter the quantity:");
		int q=s.nextInt();
		int a=10*q;
		System.out.println("Total amount:" +a);
		break;
		
	}case 3: {
		System.out.println("you are selected cold coffee");
		System.out.println("Enter the quantity:");
		int q=s.nextInt();
		int a=25*q;
		System.out.println("Total amount:" +a);
		break;
		
	}case 4: {
		System.out.println("you are selected Milkshake");
		System.out.println("Enter the quantity:");
		int q=s.nextInt();
		int a=50*q;
		System.out.println("Total amount:" +a);
		break;
		
	}
	default: {
		System.out.println("Not Available");
		break;
	}
	
	}
	}
	
	
	}
	}

