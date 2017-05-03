package call_by_value_reference;

public class Call_By_Value {
	int a, b ;
	
	public void Add(int a, int b){
		a =a; // Call By Value
		b =b;// Call By Value
		int c = a+b;
		System.out.println(c);
	};
	
	public static void main(String[] args) {
	
		Call_By_Value V = new Call_By_Value();
		V.Add(10, 20);
		System.out.println(V.a);
		System.out.println(V.b);

	}; //End of Main Method

}; // End of Class
