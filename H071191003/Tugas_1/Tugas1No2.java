/*Tugas Nomor 2
By : Arsyi Syarief Aziz
NIM : H071191003
*/
import java.util.Scanner;
class Tugas1No2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("N = ");
    int n = input.nextInt();
    int result =0;
    for(int i=1;i<=n;i++){ //mengulang hingga i == n
      if(n%i==0){ //mencari apakah n adalah kelipatan dari i
        result += i; // result bertambah 1 jika n adalah kelipatan dari i
      }
    }
    System.out.printf("Sum = %d\n",result);
  }
}
