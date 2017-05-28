package method_overriding;

//Example of Overriding and basic Inheritance 
public class TestOverriding {

	static class Person{
	
		public void talk(){
			System.out.println("All of them Talk(Person method)");
		};
		public void eat(){
			System.out.println("All of them Eat(Person Method)");
		};
		public void Sleep(){
			System.out.println("All of them Sleep(Person Method)");
		};
	}; //End of Class
	
	static class Programmer extends Person{
		@Override
		public void talk(){
			System.out.println("Hello world(Programmer Method)");
		}; //Overridden Method
		
		public void code(){
			System.out.println("All the Programers do code(Programmer Code)");
		};
		
	}; //End of Class
	
	public static void main(String[] args) {
		Person P =  new Person();
		
		P.talk(); // Method From the Person
		System.out.println("*** End of Person Class *** ");
		Programmer C =new Programmer();
		C.talk(); // Method From the Programmer
		C.eat();
		C.code();
		System.out.println("*** End of Programmer Class *** ");
		
	}; // End of Main Method

}; // End of Class 
