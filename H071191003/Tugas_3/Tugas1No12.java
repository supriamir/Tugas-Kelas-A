import java.util.Scanner;
class Tugas1No12{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input jumlah sepatu yang ada di toko : ");
    int n =input.nextInt();
    if(n<1 || n>100000){
      System.out.println("Jumlah sepatu yang diinput invalid!");
      return;
    }
    int shoeSize[] = new int[n];
    boolean available = false;
    String shoeColour[] = new String[n];
    for (int i = 0;i<n ;i++ ) {
      System.out.printf("Input ukuran sepatu ke-%d : ", i+1);
      shoeSize[i] = input.nextInt() ;
      if(shoeSize[i]<1 || shoeSize[i]>100000){
        System.out.println("Ukuran sepatu yang diinput invalid!");
        return;
      }
      System.out.printf("Input warna sepatu ke-%d : ", i+1);
      shoeColour[i] = input.next();
    }
    System.out.printf("\nInput ukuran sepatu yang ingin dicari : ");
    int desiredShoeSize = input.nextInt();
    if(desiredShoeSize<1 || desiredShoeSize>100000){
      System.out.println("Ukuran sepatu yang diinput invalid!");
      return;
    }
    System.out.printf("Input warna sepatu yang ingin dicari : ");
    String desiredShoeColour = input.next();
    for (int i=0;i<n ;i++ ) {
      if (shoeSize[i] == desiredShoeSize && shoeColour[i].equalsIgnoreCase(desiredShoeColour)){
        System.out.printf("Sepatu yang diinginkan merupakan sepatu ke-%d \n", i+1);
        available =true;
      }
    }
    if (!available) {
      System.out.println("Sepatu tidak ada di toko ini!");
    }
  }
}
