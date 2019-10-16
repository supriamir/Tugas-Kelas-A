import java.util.Scanner;

class Looping04 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int awal = obj.nextInt();
        int batas = obj.nextInt();
        int sum = 0;
        for (int k = 0; k < 10; k++) {
            if (k % 2 == 1) {
                sum += k;
            }
        }
        System.out.println("Jumlah Bilangan Ganjil  :" + sum);
    }
}