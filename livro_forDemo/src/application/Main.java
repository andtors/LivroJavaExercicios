package application;

public class Main {

	public static void main(String[] args) {
		int count;
		
		for (count = 0; count < 5; count = count+1) {
			System.out.println("This is count " + count);
		}
		System.out.println();
		
		count = 0;
		
		for (count = 0; count < 5; count++) {
			System.out.println("This is count " + count);
		}
		System.out.println("Done!");

	}

}
