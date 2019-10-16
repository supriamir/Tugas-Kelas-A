import java.util.Scanner;

class Tugas02{
    public static void main (String[] args){
        Scanner or = new Scanner (System.in);
        System.out.println("Masukkan Password anda :");
        int password = or.nextInt();
        while (! (password == (2002))){
            System.out.println("Password Anda Salah");
            System.out.println();
            System.out.println("Masukkan Pasaword Anda :");
            password = or.nextInt();

        }
        System.out.println("Password Anda Benar!");
    }
}