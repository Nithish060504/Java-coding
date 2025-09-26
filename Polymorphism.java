//Polymorphism : Poly - many, morphism - forms;
//compile time and run time
//in compile time - method overloading -same method name but different parameters


package comp3;
class Mathoperation{
	static int mul(int a,int b) {
		return a*b;
	}
	static double mul(double x,double y) {
		return x*y;
	}
	static int mul(int r) {
		return r*r;
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		System.out.println(Mathoperation.mul(4,5));
		System.out.println(Mathoperation.mul(4.0,5.0));
		System.out.println(Mathoperation.mul(4));
	}

}
