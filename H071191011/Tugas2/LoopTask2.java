import java.util.Scanner;

class LoopTask2 {
	// Buatlah program untuk membaca Password. Cetak "Password anda salah"
	// untuk semua input password yang salah dan cetak "Password anda benar"
	// jika input password anda benar. Program akan berhenti jika Password
	// yang diinput adalah benar. Password adalah 4 digit berupa integer.
	// Password = 2002
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int password = 0;

		do {
			try {
				password = sc.nextInt();
				if (password != 2002)
					System.out.println("Password Anda Salah");
			} catch (Exception e) {}
		} while (password != 2002);
		System.out.println("Password Anda Benar");
	}
}
