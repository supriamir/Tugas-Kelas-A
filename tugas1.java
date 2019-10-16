import java.util.Scanner;
class tugas1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Base = ");
        int base = obj.nextInt();
        System.out.println("Pangkat = ");
        int pangkat = obj.nextInt();
        int pow = 1;

        if (pangkat > 0) {
            for (int i = 1; i <= pangkat; i++) {
                pow = pow * base;
            }
            System.out.printf("%d ^ %d = %d" , base, pangkat, pow) ;
        }  else if ( pangkat < 0 ) {
            for (int i = -1; i >= pangkat; i--) {
                pow = pow * base;
            }
            System.out.printf("%d ^ %d = 1/%d" , base, pangkat, pow);
        } else {
            for (int i = 1 ; 1 <= pangkat; i++) {
                pow = pow * 1;
            }
            System.out.printf("%d ^ %d" , base, pangkat, pow);
        }
    }
}