/*Tugas 2 Nomor 3
By : Arsyi Syarief Aziz
NIM : H071191003
*/import java.util.Scanner;
class Tugas2No3{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //MENU
    System.out.println("1. y = 4x +1 (0<x<50; increment 5)");
    System.out.println("2. y = sqrt(x) -1 (1<x<10; increment 1)");
    System.out.println("3. y = 5(x)^2 +3x -2 (1<x<5; increment 0.5)");
    System.out.println("Pilih persamaan");
    int menu = input.nextInt();//Ambil input dari user untuk menentukan rumus
    double y=0;
    System.out.println("Anda pilih nomor "+menu);
    switch(menu){
      case 1: //rumus pertama
      for (int x =0; x<=50; x+=5){
        y = (4*x) + 1;
        System.out.printf("(x,y) = (%d,%.3f)\n",x,y);
      }
      break;
      case 2: //rumus kedua
      for (int x =1; x<=10; x+=1){
      y = Math.sqrt(x)-1;
      System.out.printf("(x,y) = (%d,%.3f)\n",x,y);
      }
      break;
      case 3: //rumus ketiga
      for (double x =1; x<=5; x+=0.5){
      y = ((5*Math.pow(x,2)) + (3*x) -2);
      System.out.printf("(x,y) = (%.1f,%.3f)\n",x,y);
      }
      break;
      default: // akan nomor yang dipilih tidak ada
      System.out.println("Pilihan anda tidak valid!");
      return;
    }

  }
}
