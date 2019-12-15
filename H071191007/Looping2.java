import java.util.Scanner;
class Looping2 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.print("Masukkan Password Anda : ");
        int password = ac.nextInt();
        while (!(password == (2002))) {
            System.out.println("Password Anda Salah");
            System.out.println("Masukkan Password Anda : ");
        }
        System.out.println("Password Anda Benar!");
    }
}