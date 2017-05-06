package abstract_class;

abstract class Display{

	public void  Method1(){
		System.out.println("Method one (Default)");
	}; //Method One
	
	abstract void Method2(); // Abstract Method
}; //End of Class

public class Demo extends Display {

	@Override
	void Method2(){
		System.out.println("Method two (Abstract)");
	}
	public static void main(String[] args) {

		Demo obj = new Demo();
		obj.Method1();
		obj.Method2();
}; //End of Main Method

}; // End of Class
