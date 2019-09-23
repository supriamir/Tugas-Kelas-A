import java.util.Scanner;
class Looping5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int pangkat = in.nextInt();
        double hasil = 1;

        if (pangkat >= 0){
            for (int x = 1; x <= pangkat ; x++){
                hasil = hasil * base;
            }
            System.out.printf("%d ^ %d = %.0f" , base , pangkat , hasil);
        } else if (pangkat < 0){
            for (int x = -1; x >= pangkat; x--){
                hasil = hasil * base;
            }
            System.out.println(base + "^" + pangkat + " = " + (1/hasil));
        }
    }
}