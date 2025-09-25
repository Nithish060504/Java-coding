package comp3;
import java.io.*;
class Grandfather{
	void land() {
		System.out.println("Have a 5 acre land");
	}
}

class Father extends Grandfather{
	void house() {
		System.out.println("Have 2bhk own house");
	}
}
class Son extends Father{
	void car() {
		System.out.println("Have a own audi car");
	}
}
public class MulInheritance {

	public static void main(String[] args) {
		Son s=new Son();
		s.car();
		s.house();
		s.land();

	}

}

