import java.util.Scanner;

class Latihan3 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Pilih fungsi : ");
        int function = key.nextInt();
        if (function==1) {
            int x = 0;
            while (x<=50) {
                int y = 4*x+1;
                System.out.println("Untuk x = " + x);
                System.out.println("Nilai fungsi y = " + y);
                x = x+5;
                }
        } else if (function==2) {
            int x = 1;
            while (x<=10) {
                double y = Math.sqrt(x)-1;
                System.out.println("Untuk x = " + x);
                System.out.println("Nilai fungsi y = " + y);
                x++;
            }
        } else if (function==3) {
            double x = 1;
            while (x<=5) {
                double y = (5*Math.pow(x, 2))+(3*x)-2;
                System.out.println("Untuk x = " + x);
                System.out.println("Nilai fungsi y = " + y);
                x = x + 0.5;
            }
        } else {
            System.out.print("error");
        }
    }
}
