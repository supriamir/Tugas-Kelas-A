/*Tugas 2 Nomor 2
By : Arsyi Syarief Aziz
NIM : H071191003
*/
import java.util.Scanner;
class Tugas2No2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int password = 2002;//Password
    int passwordInput = 0;//Inputan dari user
    //Akan terus mengambil input jika password yang diinput tidak sama dengan password alsinya
    while (passwordInput != password){
      passwordInput = input.nextInt();
      if (passwordInput == password){// jika benar keluar dari loop
        break;
      }
      System.out.println("Password anda salah");//akan print jika salah
    }
    System.out.println("Password Anda Benar");//akan print jika benar
  }
}
