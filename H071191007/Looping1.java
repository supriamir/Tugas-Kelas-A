import java.util.Scanner;
class Looping1 {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        System.out.print ("base = ");
        int base = ar.nextInt();
        System.out.print("pangkat = ");
        int pangkat = ar.nextInt();
        double sum = 1;
        if (pangkat >= 0) {
            for (int i = 1; i <= pangkat; i++) {
                sum = sum*base;
            }
            System.out.printf("%d^%d = %.0f", base,pangkat,sum);
        } else if (pangkat < 0) {
            for (int i = 1; i >= pangkat; i--) {
                sum = sum*base;
            }
            System.out.println(base + "^" + pangkat + " = " + (1/sum));
        }
    }
}