package application;

public class Main {

	public static void main(String[] args) {
	
		int counter = 0;
		double sum = 0, conversor;
		
		
		//inch = 12;
		//meter = 39.37;
		
		for(int i = 1;i<=144;i++) {
			conversor = 1 * 39.37;
			sum += conversor;
			System.out.println(sum);
			counter++;
			
			if(counter == 12) {
				System.out.println();
				counter = 0;
			}
			
			
		}

	}

}
