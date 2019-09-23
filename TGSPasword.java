import java.util.Scanner;

class TGSPasword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan password anda :");
        int password = sc.nextInt();
        while (!(password == (2002))) {
            System.out.println("Password anda salah");
            System.out.println();
            System.out.println("Masukkan password anda :");
            password = sc.nextInt();
        }
        System.out.println("Password anda benar!");
    }
} 