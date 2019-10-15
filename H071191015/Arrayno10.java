import java.util.Scanner;
class Arrayno10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris = input.nextInt();
        int kolom = input.nextInt();
        int [][] matriks = new int[baris][kolom];
        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j]=input.nextInt();
            }
        } 
        for (int i = 0; i < kolom; i++) {
            System.out.println();
            for (int j = (baris-1); j >= 0; j--) {
                System.out.print(matriks[j][i]+" ");
            }
        }
    }
}