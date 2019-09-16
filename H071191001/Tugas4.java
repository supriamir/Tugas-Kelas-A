import java.util.Scanner;

class Tugas4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positif = 0;
        int negatif = 0;
        int ganjil = 0;
        int genap = 0;

        for (int i = 1; i <= 5; i++){
            int bilangan = sc.nextInt();
          if (bilangan%2==0 ) {
              genap++;
              if (bilangan>0) {
                  positif++;
              }
              else {
                  negatif++;
              }
          }else {
              ganjil++;
          }
              
        }
        System.out.println("bilangan genap " + genap);
        System.out.println("bilangan ganjil " + ganjil);
        System.out.println("bilangan positif " + positif);
        System.out.println("bilangan negatif " + negatif);
    }
}