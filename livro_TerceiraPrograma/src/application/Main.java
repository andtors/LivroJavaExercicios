package application;

public class Main {

	public static void main(String[] args) {
		int var;
		double x;
		
		var = 10;
		x = 10.0;
		
		System.out.println("Original value of var: " + var);
		System.out.println("Original value of x: " + x);
		
		var = var / 4;
		x = x / 4;
		
		System.out.println("var After division: " + var);
		System.out.println("x After division: " + x);

	}

}
