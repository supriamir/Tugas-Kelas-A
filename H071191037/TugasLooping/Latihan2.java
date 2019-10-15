import java.util.InputMismatchException;
import java.util.Scanner;

class Latihan2{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            int pw = 2002;
            boolean guess = false;
            while(!guess){
                System.out.println("Masukkan Pasword (angka)");
                int input = inp.nextInt();
                guess = pw == input;
                if(pw != input){
                    System.out.println("Pasword anda Salah");
                }
            }
            System.out.println("Pasword anda Benar");
            inp.close();
        } catch (InputMismatchException lol) {
            System.out.println("Inputan Tidak Valid");
        }
    }
}