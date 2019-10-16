import java.util.*;
public class Soal2{
    public static void main(String[] args) {
       Scanner main = new Scanner(System.in);
       int nilaiKhusus = 2002;
       boolean statement = true;
       while (statement){
           System.out.printf("\nMasukkan Password = ");
           
           int password = main.nextInt();
           if (password != nilaiKhusus){
               System.out.printf(">>> Password Anda SALAH <<<");
           }else{
               System.out.printf(">>> Password Anda BENAR <<<");
           }
       }
       main.close();
    }
}