import java.util.InputMismatchException;
import java.util.Scanner;

class Latihan1{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("masukkan angka");
            int base = inp.nextInt();
            System.out.println("masukkan pangkat");
            int pangkat = inp.nextInt(),i=0;
            float hasil=1;
            inp.close();
            if(pangkat < 0){
                while(i > pangkat){
                    hasil *= base;
                    i--;
                }
                System.out.printf("%d^%d = %.2f",base,pangkat,1/hasil);
            }else{
                while(i < pangkat){
                    hasil *= base;
                    i++;
                }
                System.out.printf("%d^%d = %.2f",base,pangkat,hasil);
            }
        } catch (InputMismatchException e) {
            System.out.println("Inputan Tidak Valid");
        }

    }
}