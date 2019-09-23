import java.util.Scanner;
class Looping6{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Password :");
        int pass = in.nextInt();
        while (!(pass == 2002)){
            System.out.println("Password Anda Salah!");
            System.out.println();
            System.out.println("Password :");
            pass = in.nextInt();   
        }
        System.out.println("Password Anda Benar");
    }
}