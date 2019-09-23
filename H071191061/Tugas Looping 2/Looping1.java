import java.util.Scanner;
class Looping1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input bilangan : ");
        int bilangan = input.nextInt();
        System.out.print("Input pangkat  : ");
        int pangkat = input.nextInt();

        int i = 0; float hasil = 1f;
        System.out.println("\n"+bilangan+" pangkat "+pangkat);

        if(pangkat > 0){
            do {
                hasil = hasil * bilangan;
                i++;
            } while (i < pangkat);
            System.out.printf("Hasilnya = %.1f", hasil);
        }else if (pangkat < 0) {
            do {
                hasil = hasil * bilangan;
                i--;
            } while (i > pangkat);
            System.out.printf("Hasilnya = %.2f", hasil);
        }else {
            System.out.printf("Hasilnya = 1");
        }
        input.close();
    }
}