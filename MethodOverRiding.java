// Overriding - Redefining the method in derived class from the base class
package comp3;
class user{
	String name;
	int age;
	user(String n,int a){
		this.name=n;
		this.age=a;
	}
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
class Mainprogrammer extends user{
	String companyName;
	Mainprogrammer(String n,int a,String c){
		super(n,a);
		this.companyName=c;
		}
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Company:"+companyName);
	}
}
public class MethodOverRiding {

	public static void main(String[] args) {
		Mainprogrammer m=new Mainprogrammer("Ram",22,"Technologia");
		m.display();

	}

}
