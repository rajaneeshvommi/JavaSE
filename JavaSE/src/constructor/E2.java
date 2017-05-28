package constructor;

class Employee{
	public String email;
	public String name;
	public int id;
	
	// Default Constructor 
	Employee(String name , String email){
		this.name = name;
		this.email= email;
	}; //end of Method
	
	// Constructor with OverLoading
	Employee(String name,String email, int id){
		this.name = name;
		this.email = email;
		this.id= id;
	}
	
	
	public void Display(){
		System.out.println("Employee name:" + name );
		System.out.println("Employee Email:" + email);
		System.out.println("Employee id:" + id);
	};
	
	}; // End of Class
	
public class E2 {

	public static void main(String[] args) {
		
		Employee E =new Employee("rajaneesh", "some@gmail.com");
		E.Display();
		System.out.println();
		Employee E1 = new Employee("rajaneesh", "some@gmail.com" ,12);
		E1.Display();

	}; // End of Main Method

}; //End of Class 
