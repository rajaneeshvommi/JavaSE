package object_class;

//Basic Example of Object & class

class Rectangle{
	int length;
	int width;
	static String test= "Hello";
	
	void insert(int l, int w){
		length = l;
		width =w;
	};
	
	void calculateArea(){
		System.out.println(length * width);
		//System.out.println("Hello_world");
//		test = "bye";
//		System.out.println(test);
	};
	
	
}; // End of Class

public class TestRectangle {
	
	public static void main(String[] args) {
		
		Rectangle obj = new Rectangle(); //Creating Object
		Rectangle obj2 = new Rectangle(); // Creating 2nd object
			
		obj.insert(100, 100);
		obj2.insert(100, 200);
		
		obj.calculateArea();
		obj2.calculateArea();
//		
//		String Test1 = Rectangle.test = "hello"; //Example to test the Static variable 
//		System.out.println(Test1);
		//new Rectangle().calculateArea();// anonymous object
	

	}

}
