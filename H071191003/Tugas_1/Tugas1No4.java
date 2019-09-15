/*Tugas Nomor 4
By : Arsyi Syarief Aziz
NIM : H071191003
*/
import java.util.Scanner;
class Tugas1No4{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input 5 integer!");
    try{
    int input1 = input.nextInt();
    int input2 = input.nextInt();
    int input3 = input.nextInt();
    int input4 = input.nextInt();
    int input5 = input.nextInt();
    int even = 0;
    int negative = 0;
    //Mencari jumlah bilangan genap
    if(input1 % 2 ==0){
      even++;
    }
    if(input2 % 2 ==0){
      even++;
    }
    if(input3 % 2 ==0){
      even++;
    }
    if(input4 % 2 ==0){
      even++;
    }
    if(input5 % 2 ==0){
      even++;
    }

    int odd = 5 - even; //Mencari jumlah ganjil dengan mengurangi 5 dengan jumlah genap
    int zero =0;
    //Mencari jumlah bilangan positif dan nol
    if(input1==0){
      zero++;
    }else if((Math.abs(input1) + input1)==0){
      negative++;
    }
    if(input2==0){
      zero++;
    }else if((Math.abs(input2) + input2)==0){
      negative++;
    }if(input3==0){
      zero++;
    }else if((Math.abs(input3) + input3)==0){
      negative++;
    }if(input4==0){
      zero++;
    }else if((Math.abs(input4) + input4)==0){
      negative++;
    }if(input5==0){
      zero++;
    }else if((Math.abs(input5) + input5)==0){
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
