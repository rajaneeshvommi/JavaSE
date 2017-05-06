package interface_class;

interface Rec{
	public void Draw(); // Method
	
	default void Shape(){
		System.out.println("Shape is Rectangle");
	}; // Default Method
	
}; //End of Interface

interface Tri{
	public void Show(); // Method
	
	static void Shape(){
		System.out.println("Static Method");
	}; //static Method
	
}; //End of Interface

class CommonImplementation implements Rec, Tri{ 
	// Multiple Inheritance With Interface
	
	@Override
	public void Draw(){
		System.out.println("Method from Rectangle");
	}; // Method of Rectangle
	
	@Override
	public void Show(){
		System.out.println("Shape is Triangle");
	};// Method of Triangle
}; //End of Implementation

public class Demo_Mutiple_inheritance {

	public static void main(String[] args) {
	
		CommonImplementation obj = new CommonImplementation();
		obj.Draw(); // Method of Rectangle
		obj.Show(); // Method of Triangle 
		obj.Shape(); // Method of Rectangle 
		Tri.Shape(); //Static Method of Triangle
	}; // End of Main Method

}; //End of Class
