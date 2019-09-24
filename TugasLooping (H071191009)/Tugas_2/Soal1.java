import java.util.*;
public class Soal1{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.printf("Masukan Base = ");
        int a = n.nextInt();
        System.out.printf("Masukan Pangkat = ");
        int b = n.nextInt();
        int hasil = 1;
        int i;        
        for ( i = 1; i <= b; i++){
            hasil = hasil * a;
        }
        System.out.printf("Hasil "+a+ "^" +b+ " = " );
        System.out.print(hasil);

    }
}