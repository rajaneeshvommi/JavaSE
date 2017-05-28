package constructor;

// Basic Example of default constructor

public class E1 {
	int a;
	String name;
	double x;

	public E1() {
		System.out.println("Hello I am Constructor");
	}; // End of Method
	
	public void Display(){
		System.out.println(a+" "+name+" "+x);
	}
	

	public static void main(String[] args) {

		E1 e; // object Reference

		e = new E1();// Object Creation
		
		e.Display();

	}; // End of Main Method

}; // End of Class
