/*Tugas 1 Nomor 3
By : Arsyi Syarief Aziz
NIM : H071191003
*/
import java.util.Scanner;
class Tugas1No3{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("N = ");
    int n = input.nextInt();
    int counter = 0;
    System.out.print("Bilangan ganjil = ");
    for(int i = 1;i<=n;i++){ // mengulang hingga i == n
      if(i%2==1){ //Mecari apakah i adalah bilangan ganjil
        System.out.printf(" %d ",i);
        counter++; // // counter bertambah 1 jika n adalah kelipatan dari i
      }
    }
    System.out.printf("\nBanyak bilangan ganjil = %d\n",counter);
  }
}
