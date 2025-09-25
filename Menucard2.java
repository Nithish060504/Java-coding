package comp3;
import java.util.Scanner;

public class Menucard2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(int i=0;;i++) {

        System.out.println("Menu Card:");
        System.out.println("1. Coffee       Rs.15");
        System.out.println("2. Tea          Rs.10");
        System.out.println("3. Cold Coffee  Rs.25");
        System.out.println("4. Milkshake    Rs.50");

        System.out.print("Enter your Choice: ");
        int ch = s.nextInt();

        int price=0;
        String item = "";
        
        switch(ch) {
        
            case 1: item = "Coffee"; 
            price = 15; 
            break;
            case 2: item = "Tea"; 
            price = 10; 
            break;
            case 3: item = "Cold Coffee"; 
            price = 25; 
            break;
            case 4: item = "Milkshake"; 
            price = 50; 
            break;
               
        
        }
        
          if(ch==0 || ch>=5) {
        	  System.out.println("Enter Your choice 1 to 4");
        	 
          }
          else {
        System.out.println("You selected " + item);
        System.out.print("Enter the quantity: ");
        int q = s.nextInt();

        int total = price * q;
        System.out.println("Total amount: Rs." + total);
          }
        }
    }
}
