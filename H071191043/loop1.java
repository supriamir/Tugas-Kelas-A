import java.util.Scanner;
class Loop1{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("base = ");
        int base = in.nextInt();
        System.out.println("pangkat = ");
        int pangkat = in.nextInt();
        double hasil = 1;

        if (pangkat >= 0 ){
            for (int i = 1; i <= pangkat; i++){
                hasil = hasil * base;
            }
            System.out.printf("%d^%d^ = %.0f", base, pangkat, hasil);
        }
        else if (pangkat < 0){
            for (int i = -1; i >= pangkat; i--){
                hasil = hasil * base;
            }
            System.out.println(base + "^" + pangkat + " = " + (1 / hasil));
        }
        in.close();
    }
}