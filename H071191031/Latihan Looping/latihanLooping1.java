import java.util.Scanner;
class latihanLooping1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan base: ");
        double base = sc.nextInt();
        System.out.println("Masukkan pangkat: ");
        int pangkat = sc.nextInt();
        double base2 = base;
        int i;
        if (pangkat > 0) {
            for (i = 1; i < pangkat; i++) {
                base = base*base2;
            }
        
        System.out.printf("%.0f^%d = %.0f",base2,pangkat,base);
        } else {
        for (i = -1; i < pangkat; i--) {
            base = base * base2;
        }
        double hasil = 1/base;
        System.out.printf("%.0f^%d = %.0f",base2,pangkat,hasil);
    }
}
}