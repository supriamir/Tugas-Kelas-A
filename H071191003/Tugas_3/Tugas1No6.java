import java.util.Scanner;
class Tugas1No6{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input pajang Segitiga : ");
    int triLen = input.nextInt();
    int arr[][] = new int[triLen][triLen];
    for(int i = 0; i<triLen; i++){
      for (int j = 0;j<=i ;j++ ) {
          arr[i][j] = input.nextInt();
      }
    }
    /* Menghitung dari bawah dan mencari bilangan paling besar antara [i][j] dan
    [i][j+1] dan menambahkan bilangan itu dengan [i][j]*/
    for (int i =triLen-1;i>=0  ;i-- ) {
      for (int j =0; j<=i-1; j++){
          if (arr[i][j]+arr[i-1][j]>arr[i][j+1]+arr[i-1][j]){
            arr[i-1][j] += arr[i][j];
          }else {
            arr[i-1][j] += arr[i][j+1];
          }

        }
    }
    System.out.printf("\nNilai paling besar yang dapat diambil : %d\n", arr[0][0]);
  }
}
