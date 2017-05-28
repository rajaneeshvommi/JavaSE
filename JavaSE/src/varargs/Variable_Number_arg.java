package varargs;

// Variable number of Arguments

public class Variable_Number_arg {
	public static int Input(int... value){
		
		int Total=0;
		
		// For Enhance Loop
		for(int n : value){
			Total += n;
		}; // End of loop
		
		return Total;
		
	}; //End of Total Method
	
	public static void main(String[] args) {		
		
		int A =Input();
		int B =Input(1,2,3,4,5);
		
		System.out.println(A);
		System.out.println(B);
		
		
	}

}
