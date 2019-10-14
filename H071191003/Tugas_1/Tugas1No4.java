/*Tugas 1 Nomor 4
By : Arsyi Syarief Aziz
NIM : H071191003
*/
import java.util.Scanner;
class Tugas1No4{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input 5 integer!");
    try{
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int d = input.nextInt();
    int e = input.nextInt();
    int even = 0;
    int negative = 0;
    //Mencari jumlah bilangan genap
    if(a % 2 ==0){
      even++;
    }
    if(b % 2 ==0){
      even++;
    }
    if(c % 2 ==0){
      even++;
    }
    if(d % 2 ==0){
      even++;
    }
    if(e % 2 ==0){
      even++;
    }

    int odd = 5 - even; //Mencari jumlah ganjil dengan mengurangi 5 dengan jumlah genap
    int zero =0;
    //Mencari jumlah bilangan negatif dan nol
    if(a==0){
      zero++;
    }else if((Math.abs(a) + a)==0){
      negative++;
    }
    if(b==0){
      zero++;
    }else if((Math.abs(b) + b)==0){
      negative++;
    }if(c==0){
      zero++;
    }else if((Math.abs(c) + c)==0){
      negative++;
    }if(d==0){
      zero++;
    }else if((Math.abs(d) + d)==0){
      negative++;
    }if(e==0){
      zero++;
    }else if((Math.abs(e) + e)==0){
      negative++;
    }

    int positive = 5-zero-negative;//Mencari bilangan positif dengan mengurangi 5 dengan jumlah nol dan bilangan negatif
    System.out.printf("%d Bilangan Genap\n",even);
    System.out.printf("%d Bilangan Ganjil\n",odd);
    System.out.printf("%d Bilangan Positif\n",positive);
    System.out.printf("%d Bilangan Negatif\n",negative);
    }catch(Exception e){
      System.out.println("Invalid Input Format"); //Mengeluarkan message jika terjadi kesalahan input
    }

  }
}
