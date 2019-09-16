import java.util.Scanner;
class Tugas4 {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
       int genap = 0;
       int ganjil = 0;
       int positif = 0;
       int negatif = 0;

       for (int r = 1; r <= 5; r++) {
            int bilangan = ma.nextInt();
            if (bilangan % 2 == 0) {
                genap++;
                if (bilangan > 0) {
                    positif++;
                }
                else {
                    negatif++;    
                }
            }
            else {
                ganjil++;
                if (bilangan > 0) {
                    positif++;
                }
                else {
                    negatif++;

                }
            }
       }
         System.out.println(genap + " bilangan genap");
         System.out.println(ganjil + " bilangan ganjil");
         System.out.println(positif + " bilangan positif");
         System.out.println(negatif + " negatif");
    }
}