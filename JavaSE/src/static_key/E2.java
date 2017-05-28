package static_key;

// Static Variable
class Employee{
	public String email;
	public String name;
	public static String company = "tech";
	
	Employee(String name , String email){
		this.name = name;
		this.email= email;
	}; //end of Method
	
	
	 void Display(){
		System.out.println("Employee name:" + name );
		System.out.println("Employee Email:" + email);
		System.out.println("Employee id:" + company);
	};
	
	}; // End of Class


public class E2 {

	public static void main(String[] args) {
		
		Employee E = new Employee("rajaneesh", "Some@gmail.com");
		E.Display();

	}

}
