package application;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int n, d, q;
		n = 10;
		d = 2;

		if (d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " + n);

		if (d != 0 & (n % d) == 0)
			System.out.println(d + " is a factor of " + n);

		System.out.println();

		int i;
		i = 0;

		if (false & (i++ < 100))
			System.out.println("this wont be displayed");
		System.out.println("if statement executed: " + i);
		if (false && (++i < 100))
			System.out.println("this wont be displayed");
		System.out.println("if statement executed: " + i);

	}

}
