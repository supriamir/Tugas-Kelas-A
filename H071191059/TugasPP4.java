import java.util.Scanner;
class TugasPP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;
        System.out.print("Input bilangan = ");

        for (int i = 0 ; i < 5 ; i++) {
            int angka = sc.nextInt();
            if (angka %2==0 && angka!=0) {
                genap++;
                if (angka > 0){
                    positif++;
                } else {
                    negatif++;
                }
            }
            else if  (angka %2!=0 && angka != 0) {
                ganjil++;
                if (angka > 0) {
                    positif++;
                } else {
                    negatif++;
                }
            }
        }
        System.out.println(genap + " genap");
        System.out.println(ganjil + " ganjil");
        System.out.println(positif + " positif");
        System.out.println(negatif + " negatif");

        sc.close();
    } 
}