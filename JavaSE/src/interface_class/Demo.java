package interface_class;

interface Shapes{
	public void Draw(); // Draw Method
};// End of Interface

class Rectangle implements Shapes{
	@Override
	public void Draw(){
		System.out.println("Shape is Rectangle");
	}; // End of Method Draw in Rectangle 
}; //End of class

class Triangle implements Shapes{
	@Override
	public void Draw(){
		System.out.println("Shape is Triangle");
	}; //End of Draw Method in Triangle 
}; //End of Class

public class Demo {
	public static void main(String[] args) {
		
		Rectangle obj = new Rectangle();
		obj.Draw();
		
		Triangle obj1 = new Triangle();
		obj1.Draw();

	} ;// End of Main Method

}
