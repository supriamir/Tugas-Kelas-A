import java.util.Scanner;
class Aa2n1{
    public static void main(String[] args) {
        Scanner wScanner = new Scanner(System.in);
        int angka = wScanner.nextInt();
        System.out.println("Faktor dari "+angka+" adalah ");
        for(int i = 1; i <= angka; i++){
            if(angka % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}