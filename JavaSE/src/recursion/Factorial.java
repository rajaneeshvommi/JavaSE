package recursion;

// Factorial of Given Number

public class Factorial {
	

	public int Factorial_Numbers(int n) {
		if (n == 1) {
			return 1;
		} else {
			
			return (n*Factorial_Numbers(n - 1));
		}
	}; // End of Method

	public static void main(String[] args) {
		Factorial F = new Factorial();
		System.out.println("Factorial of :" + F.Factorial_Numbers(5));
	}; // End of Main Method

}; // End of class
