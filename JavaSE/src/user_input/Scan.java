package user_input;

import java.util.Scanner;

// User Input 
public class Scan {

	public static void main(String[] args) {
		// First Input
		System.out.println("Enter the value1:");
		Scanner Userdata = new Scanner(System.in);
		int num1 = Userdata.nextInt();
		
		// Second Input
		System.out.println("Enter the value1:");
		Scanner  Input1 = new Scanner(System.in);
		int num2 = Input1.nextInt();
		System.out.println(num1 + num2);
	
	}

}
