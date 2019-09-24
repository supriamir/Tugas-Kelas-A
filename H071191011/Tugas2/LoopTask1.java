import java.util.Scanner;

class LoopTask1 {
	// Buatlah Program untuk menghitung pangkat sebuah bilangan dengan
	// menggunakan perulangan (Looping) tanpa menggunakan fungsi Math.pow()
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("base = ");
		double base = sc.nextDouble();
		System.out.print("pangkat = ");
		int exponent = sc.nextInt();

		if (exponent == 0) {
			// n^0 = 1 jika n != 0
			// 0^0 = 0
			if (base == 0)
				System.out.println("0.0^0 = 0");
			else
				System.out.println(base + "^0 = 1");
		} else {
			boolean negativeExponent = exponent < 0;
			exponent = Math.abs(exponent);

			double value = base;
			for (int i = 1; i < exponent; i++)
				value *= base;
			
			// n^-x = 1/(n^x)
			if (negativeExponent)
				System.out.println(base + "^-" + exponent + " = " + (1.0/value));
			else
			System.out.println(base + "^" + exponent + " = " + value);
		}
	}
}
