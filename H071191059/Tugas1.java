import java.util.Scanner;
class Tugas1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double base = sc.nextDouble();
    double pangkat = sc.nextDouble();
    double jumlah = 1;

    if (pangkat > 0) {
        for (int i = 1; i <= pangkat ; i++) {
            jumlah = jumlah*base;
        }
        System.out.println(base + "^" + pangkat + " = " + jumlah);
    } else if (pangkat < 0) {
        for (int i = -1 ; i >= pangkat ; i--) {
            jumlah = jumlah*base;
        }
        System.out.println(base + "^" + pangkat + " = " + (1/jumlah));
    } else if (pangkat == 0){
        System.out.println(base + "^" + pangkat + " = " + "1");
    }
    sc.close();
    }
}