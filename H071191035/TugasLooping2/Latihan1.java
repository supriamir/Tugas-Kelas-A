import java.util.Scanner;

class Latihan1 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        //input bilangan pokok dan pangkat
        System.out.print("Input base : ");
        int base = key.nextInt();
        System.out.print("Input power : ");
        int power = key.nextInt();
        int i = 0; float result = 1f; 
        //jika pangkatnya lebih besar dari nol
        if (power > 0) {
            do {
                result = result*base;
                i++;
            } while (i < power);
            System.out.printf("Result : %.1f", result);
        }
        //jika pangkatnya lebih kecil dari nol 
        else if (power < 0) {
            do {
                result =result*base;
                i--;
            } while (i > power);
            result = 1/result;
            System.out.printf("Result : %.3f", result);
        }
        //jika pangkatnya nol 
        else {
            System.out.printf("Result : 1");
        }
    }
}