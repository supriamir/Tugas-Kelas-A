import java.util.Scanner;

class PP4Number10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		if (n <= 0 || m <= 0) {
			System.out.println("Tidak ada ukuran matriks yang aman");
			return;
		}

		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// Putar 90 derajat searah jarum jam
		int arr2[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr2[i][j] = arr[n - j - 1][i];
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
