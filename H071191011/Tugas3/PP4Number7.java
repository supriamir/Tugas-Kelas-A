import java.util.Scanner;

class PP4Number7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if (n < 3) {
			System.out.println("Tidak ada array yang aman");
			return;
		}

		String[] nama = new String[n];
		int[] skor = new int[n];

		for (int i = 0; i < n; i++) {
			nama[i] = sc.next();
			skor[i] = sc.nextInt();
		}

		// Bubble sort
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (skor[j] < skor[j + 1]) {
					String temp1 = nama[j];
					nama[j] = nama[j + 1];
					nama[j + 1] = temp1;

					int temp2 = skor[j];
					skor[j] = skor[j + 1];
					skor[j + 1] = temp2;
				}
			}
		}

		System.out.println(skor[0] + skor[1] + skor[2]);
		System.out.println(nama[0]);
		System.out.println(nama[1]);
		System.out.println(nama[2]);
	}
}
