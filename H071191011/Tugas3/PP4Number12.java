import java.util.Scanner;

class PP4Number12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if (n < 1 || n > 100000) {
			System.out.println("Tidak ada N yang aman");
			return;
		}

		int sepatu[] = new int[n];
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			if (temp < 1 || temp > 100000) {
				System.out.println("Tidak ada nomor sepatu yang aman");
				return;
			}

			sepatu[i] = temp;
		}

		int nomorSepatu = sc.nextInt();

		for (int i = 0; i < n; i++) {
			if (sepatu[i] == nomorSepatu)
				System.out.println(i + 1);
		}
	}
}
