package method_overloading;

public class TestOverLoading {

	public static int add(int a, int b){return a+ b;}; //Static Method
	public static void add(double a, double b){
		double c = a+b;
		System.out.println(c);
	}; //static Method
	
	public static void main(String[] args) 
	{
		System.out.println(TestOverLoading.add(10, 20));
		TestOverLoading.add(10.000, 20.30);
	}; //End of Main Method

}; //End of Class  
