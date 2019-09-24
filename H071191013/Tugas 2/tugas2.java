import java.util.Scanner;
class Tugas2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Password Anda :");
        int password = scan.nextInt();
        while (!(password == (2002))){
            System.out.println("Password Anda Salah");
            System.out.println();
            System.out.println("Masukkan Password Anda : ");
            password = scan.nextInt();
        }
        System.out.println("Password Anda Benar!");
    }
}