class LoopTask3 {
	// Buatlah program untuk mendapat nilai y dengan menggunakan persamaan
	// dibawah, dimana x adalah range.
	// 1. y = 4x + 1; x = 0...50 increment 5
	// 2. y = sqrt(x) - 1; x = 1...10 increment 1
	// 3. y = 5x^2 + 3x - 2; x = 1...5 increment 0.5
	public static void main(String[] args) {
		// y = 4x + 1
		System.out.println("y = 4x + 1");
		System.out.println("x\t\ty");
		for (int x = 0; x <= 50; x += 5) {
			int y = 4 * x + 1;
			System.out.println(x + "\t\t" + y);
		}

		// y = sqrt(x) - 1
		System.out.println("y = sqrt(x) - 1");
		System.out.println("x\t\ty");
		for (int x = 1; x <= 10; x++) {
			double y = Math.sqrt(x) - 1.0;
			System.out.println(x + "\t\t" + y);
		}

		// y = 5x^2 + 3x - 2
		System.out.println("y = 5x^2 + 3x - 2");
		System.out.println("x\t\ty");
		for (int i = 2; i <= 10; i++) {
			// Tidak ada double yang aman, mending bagi 2 disini
			// daripada +0.5
			double x = i / 2.0;
			double y = 5 * x * x + 3 * x - 2;
			System.out.println(x + "\t\t" + y);
		}
	}
}