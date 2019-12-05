import java.util.Scanner;
class Tugas4{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int positif = 0;
        int negatif = 0;
        int ganjil = 0;
        int genap = 0;

        for (int i = 0; i < 5; i++) {
            int n = in.nextInt();
            int posfNeg = n >= 0 ? positif++ : negatif++;
            int genGan = n % 2 == 0 ? genap++ : ganjil++;
        }
        System.out.printf("%d Bilangan Genap\n", genap);
        System.out.printf("%d Bilangan Ganjil\n", ganjil);
        System.out.printf("%d Bilanagn Positif\n", positif);
        System.out.printf("%d Bilangan Negatif\n", negatif);

        in.close();   
    }
}