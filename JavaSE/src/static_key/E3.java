package static_key;

//Static Method

class Student{
	int roll;
	String name;
	static String company ="tech";
	
	Student(int roll, String name){
		this.roll = roll;
		this.name =name;
	}; 
	
	
	static public void update(){
		company = "Wipro";
	}; // Method
	
	public void Display(){
		System.out.println("roll Number:" + roll);
		System.out.println("Name:" + name);
		System.out.println("Company:" + company);
	}; 
	
}; // End of class

public class E3 {

	public static void main(String[] args) {
		
		Student S1 = new Student(10, "rajaneesh");
		S1.Display();
		Student.update();
		System.out.println("*********Break***********");
		Student S2 = new Student(20,"kumar");
		S2.Display();
	}; //End of Main Method

}; //End of Class
