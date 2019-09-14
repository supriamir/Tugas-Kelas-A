import java.util.Scanner;

class Task1Number1 {
	// Cetak semua faktor dari suatu bilangan N
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read input
		System.out.print("N = ");
		int n = Math.abs(sc.nextInt());
		if (n > 0) {
			System.out.print("Faktor dari " + n + " adalah ");

			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					// Cetak faktor
					System.out.print(i);
					if (i != n)
						// Tambahkan koma
						System.out.print(", ");
				}
			}

			// Baris baru
			System.out.println();
		} else
			System.out.println("N tidak boleh nol");
	}
}
