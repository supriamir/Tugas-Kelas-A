/*Tugas 1 Nomor 1
By : Arsyi Syarief Aziz
NIM : H071191003
*/
import java.util.Scanner;
class Tugas1No1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("N = ");
    int n = input.nextInt();
    System.out.printf("Faktor dari %d adalah ",n);
    for(int i =1; i<=n; i++){ // mengulang hingga i == n
      if(n%i==0){ //Mencari apakah n adalah kelipatan dari i
        System.out.printf("%d ",i); //print hasil
      }
    }
    System.out.print("\n"); //Menambahkan enter untuk mempercantik output
  }
}
