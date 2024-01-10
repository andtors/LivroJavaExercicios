package application;

public class Main {

	public static void main(String[] args) {
		int iresult, irem;
		double dresult, drem;
		
		iresult = 10 /3;
		irem = 10 % 3;
		
		dresult = 10.0 / 3.0;
		drem = 10.0 % 3.0;
		
		System.out.println("Resultado e o resto de 10 / 3 é: " + iresult + " e " + irem);
		System.out.println("Resultado e o resto de 10 / 3 é: " + dresult + " e " + drem);

	}

}
