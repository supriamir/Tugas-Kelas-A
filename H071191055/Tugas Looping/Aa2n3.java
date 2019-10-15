import java.util.Scanner;
class Aa2n3{
    public static void main(String[] args) {
        Scanner fScanner = new Scanner(System.in);
        int sum = 0;
        int angka = fScanner.nextInt();
        System.out.println("Bilangan Ganjil : ");
        for(int i = 1; i <= angka; i++){
            if(i % 2 == 1){
                System.out.print(i + " ");
                sum++;
            }
        }
        System.out.println("\nBanyak Bilangan Ganjil : " + sum);
    }
}