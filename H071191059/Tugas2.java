import java.util.Scanner;
class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan password = ");
        int password = sc.nextInt();

        while(password != 2002) {
            System.out.println("Password anda salah");
            System.out.print("Masukkan password = ");
            password = sc.nextInt();
        }
        System.out.println("Password anda benar");
        sc.close();
    }
}