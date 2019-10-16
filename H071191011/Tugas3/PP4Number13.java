import java.util.Scanner;

class PP4Number13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[][] = new int[n][];

		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int b[] = new int[m];

			for (int j = 0; j < m; j++) {
				b[j] = sc.nextInt();
			}

			a[i] = b;
		}

		for (int i = 0; i < n; i++) {
			double sum = 0.0;

			for (int j: a[i]) {
				sum += j;
			}

			sum /= a[i].length;

			int fail = 0;
			for (int j: a[i]) {
				if (j < sum)
					fail++;
			}

			System.out.println(fail);
		}
	}
}
