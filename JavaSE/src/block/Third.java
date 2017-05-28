package block;

class First{
	//Initialization Block
	{
		System.out.println("Initialization Block of First");
	};
	
	// static Block
	static{
		System.out.println("Static Block of First");
	}; 
	
	//default Constructor
	First()
	{
		System.out.println("Constructor Block of First");
	};
	
	
}; // End of Class First


class Second extends First {
	 // Initialization Block
	{
		System.out.println("Initialization Block of second");
	};
	
	//Static Block
	static{
		System.out.println("Static Block of Second");
	}; 
	
	// Default Constructor
	Second()
	{
		System.out.println("Constructor Block of Second");
	};
	
	
}; // End of Class First



public class Third {

	public static void main(String[] args) {
		First a = new Second();
		System.out.println("*****************Break************");
		Second b = new Second();

	}

}
