package application;

public class Main {

	public static void main(String[] args) {
		boolean b;
		
		b = false;
		System.out.println("b is " + b);
		
		b = true;
		System.out.println("b is " + b);
		
		b = false;
		if(b) {
			System.out.println("This is not be executed");
		} 
		
		b = true;
		if(b) {
			System.out.println("This is will be executed");
		}
		
		

	}

}
