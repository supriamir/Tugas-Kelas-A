import java.util.Scanner;
class tugaspp2{
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        System.out.println(" Masukkan kata sandi");
        int password = ww.nextInt();

        while (password != 2002){
            System.out.println("Passaword anda salah");
            password = ww.nextInt();
        }
        System.out.println("Password anda benar");
        ww.close();
        }
}