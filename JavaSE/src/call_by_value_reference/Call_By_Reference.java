package call_by_value_reference;

public class Call_By_Reference {
	
	public int a, b ;
	
	public void Add(int a, int b){
		this.a =a; //Call by Reference
		this.b =b; //Call by Reference
		int c = a+b;
		System.out.println(c);
	};
	
	public static void main(String[] args) {
	
		Call_By_Reference  R = new Call_By_Reference();
		R.Add(10, 20);
		System.out.println(R.a);
		System.out.println(R.b);
	}; //End of Main Method

}; //End of Class
