import java.util.Scanner;
class Tugasloop22 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int nilai = 2002;
        boolean kondisi = true;
        System.out.println("Masukkan Password");
        
        while (kondisi) {
            
            int password = input.nextInt();
            if (password!=nilai) {
                System.out.println("Password Anda Salah");
            } else {
                System.out.println("Password Anda Benar");
                kondisi = false;
            }
            
        }
        
    }
}