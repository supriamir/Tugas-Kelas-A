import java.util.Scanner;
class tugas2 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Masukkan Password Anda :");
        int password = obj.nextInt();

        while (!(password == (2002))) {
            System.out.println("Password Anda Salah");
            System.out.println();
            System.out.println("Masukkan Password Anda :");
            password = obj.nextInt();

        }
        System.out.println("Password Anda Benar");
    }
}