package comp3;
import java.io.*;
class father{
	void house() {
		System.out.println("Have a own house");
	}
}
class son1 extends father{
	void car() {
		System.out.println("Have a audi car");
	}
}
class son2 extends father{
	void bike() {
		System.out.println("Have a Kawasaki bike");
	}
}
public class HierarchialInheritance {

	public static void main(String[] args) {
	son1 s1= new son1();
	son2 s2=new son2();
	
	s1.car();
	s1.house();
	s2.bike();
	s2.house();

	}

}
