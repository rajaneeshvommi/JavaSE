package static_key;

// Static Variable

class Counter{
	static int count =0;
	
	// Default constructor
	Counter(){
		count++;
		System.out.println(count);
	};
	
	
}; //End of class
public class E1 {

	public static void main(String[] args) {
		
			Counter c0 = new Counter();
			Counter c1 = new Counter();
			Counter c2 = new Counter();
		

	}; // End of Main Method

}; // End of Class
