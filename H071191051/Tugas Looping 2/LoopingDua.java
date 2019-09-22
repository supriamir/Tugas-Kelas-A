import java.util.Scanner;

public class LoopingDua{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int nilaiKhusus = 2002;
        boolean kondisi = true;
        while (kondisi){
            System.out.print("Masukkan password = ");
            int password = userInput.nextInt();
            if (password != nilaiKhusus){
                System.out.println("Password Salah");
            }else{
                System.out.println("Password Benar");
                kondisi = false;
            }
        }
        userInput.close();
    }
}
