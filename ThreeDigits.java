package comp3;

public class ThreeDigits {

    public static void main(String[] args) {
        int n = 192; 
        int n2 = n * 2;
        int n3 = n * 3;

        
        String result = "" + n + n2 + n3;

        System.out.println(result);
        if(result.length()!=9) {
        	System.out.println("Not a fascinating");
        	return;
        }
        boolean digits[]=new boolean[10];
        
        for(int i=0;i<9;i++) {
        	int b=result.charAt(i)-'0';
        	if(b==0 || digits[b]) {
        		System.out.println("Not a fascinating number");
        		return;
        	}
         digits[b]=true;
        }
        
        for(int i=1;i<=9;i++) {
        	if(!digits[i]) {
        		System.out.println("Not a Fascinating number");
        		return;
        	}
    }
        System.out.println("Fascinating Number");
        
    }
    }