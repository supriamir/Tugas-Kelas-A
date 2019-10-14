/*Tugas 2 Nomor 1
By : Arsyi Syarief Aziz
NIM : H071191003
*/
import java.util.Scanner;
class Tugas2No1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Mengambil input dari user
    System.out.print("Base = ");
    int base = input.nextInt();
    System.out.print("Pangkat = ");
    int power = input.nextInt();

    double result =1;//nilai default
    //mengiterasi untuk cari pangkat
    for (int i=0;i<Math.abs(power);i++){
      result *=base;
    }
    //hasil di inverse jika pangkatnya negatif
    if (power<0){
      result = 1/result;
    }
    //jika base dan pangkat 0 maka TTD
    if (base == 0 && power ==0){
      System.out.println("Tidak Terdefinisi");
    }else{
      System.out.printf("%d^%d = %f\n",base,power,result);//Print hasil

    }
  }
}
