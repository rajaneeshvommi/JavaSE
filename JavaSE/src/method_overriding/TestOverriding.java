package method_overriding;

public class TestOverriding {

	static class Person{
		public void talking(){
			System.out.println("All the person Talking");
		};
		public void eatting(){
			System.out.println("All the person Eatting");
		};
		public void Sleep(){
			System.out.println("All the person Sleep");
		};
	}; //End of Class
	
	static class Programmer extends Person{
		@Override
		public void talking(){
			System.out.println("All the Programming talk less work more");
		}; //Overridden Method
		
		public void codding(){
			System.out.println("All the Programming do code");
		};
		
	}; //End of Class
	
	public static void main(String[] args) {
		Person P = new Person();
		P.talking(); // Method From the Person
		Programmer C =new Programmer();
		C.talking(); // Method From the Programmer
		C.eatting();
	}; // End of Main Method

}; // End of Class 
