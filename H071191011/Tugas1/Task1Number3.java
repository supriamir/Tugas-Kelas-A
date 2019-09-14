import java.util.Scanner;

class Task1Number3 {
	// 3. Cetak bilangan ganjil dari bilangan N
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read input
		System.out.print("N = ");
		int input = sc.nextInt();

		// Untuk menangani input negatif
		int n = Math.abs(input);
		int sign = 1;
		if (n != 0)
			sign = Math.abs(input) / input;

		// Proses
		System.out.print("Bilangan ganjil = ");
		for (int i = 1; i <= n; i += 2) {
			// `sign` = 1 (jika input positif) atau -1 (jika input negatif)
			System.out.print(i * sign);

			if (i + 2 <= n)
				System.out.print(", ");
		}

		System.out.println("\nBanyak bilangan ganjil = " + (n + 1) / 2);
	}
}
