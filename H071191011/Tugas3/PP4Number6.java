import java.util.Scanner;

class PP4Number6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if (n <= 1) {
			System.out.println("Tidak ada input yang aman");
			return;
		}

		int arr[][] = new int[n][];
		for (int i = 0; i < n; i++) {
			arr[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				int input = sc.nextInt();
				if (input >= 0 && input <= 99)
					arr[i][j] = input;
				else {
					System.out.println("Tidak ada input yang aman");
					return;
				}
			}
		}

		// Kombinasi bil. 2^(n-1)
		int combination = 2;
		for (int i = 2; i < n; i++) {
			combination *= 2;
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < combination; i++) {
			int belok = 0;
			int test = arr[0][0];

			for (int j = 0; j < n - 1; j++) {
				int k = 1;
				for (int l = 0; l < j; l++) {
					k *= 2;
				}

				belok += (i & k) != 0 ? 1 : 0;
				test += arr[j + 1][belok];
			}

			if (test > max)
				max = test;
		}

		System.out.println(max);
	}
}
