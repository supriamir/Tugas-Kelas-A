import java.util.Scanner;
class Tugas1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("base = ");
        int base = scan.nextInt();
        System.out.println("Pangkat = ");
        int pangkat = scan.nextInt();
        double sum = 1;
        if (pangkat >= 0 ) {
            for (int i = 1; i <= pangkat; i++) {
                sum = sum * base;
            }
            System.out.printf("%d^%d = %.0f", base,pangkat,sum);
        } else if (pangkat < 0) {
            for (int i = 1; i >= pangkat; i--) {
                sum = sum * base;
            }
            System.out.println(base + " ^ " + pangkat + " = " + (1/sum));
        }
    }
}