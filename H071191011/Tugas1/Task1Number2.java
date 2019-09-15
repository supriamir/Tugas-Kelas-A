import java.util.Scanner;

class Task1Number2 {
	// 2. Cetak semua faktor dari bilangan N dan tentukan sum faktornya.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read input
		System.out.print("N = ");
		int n = sc.nextInt();
		if (n > 0) {
			int sum = 0;

			for (int i = 1; i <= n; i++)
				// Ternary. <kondisi> ? <nilai jika true> : <nilai jika false>
				sum += n % i == 0 ? i : 0;
			
			System.out.println("sum = " + sum);
		} else
			System.out.println("N harus setidaknya 1");
	}
}
