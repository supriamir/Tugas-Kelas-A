import java.util.Scanner;

class Looping03 {
    public static void main(String[] args) {
        int sum = 0;
        for (int k = 0; k < 20; k++) {
            sum = sum + k;
        }
        System.out.println("Jumlah 0-99 :" + sum);
    }
}