import java.util.Scanner;
class Aa2n2{
    public static void main(String[] args) {
        Scanner dScanner = new Scanner(System.in);
        int sum = 0;
        int angka = dScanner.nextInt();
        for(int i = 1; i <= angka; i++){
            if(angka % i == 0){
                sum += i;
            }
        }System.out.println("Sum : "+sum);
    }
}