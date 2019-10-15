import java.util.Scanner;
class tugaspp1{
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        System.out.println(" Masukkan angka ");
        int angka = ww.nextInt();
        System.out.println("Masukkan pangkat");
        int pangkat = ww.nextInt();
        int i = 0;
        double j = 1;
        ww.close();
        
        if (pangkat<0){
            while (i>pangkat){
                j = j*angka;
                i--;
            }
            System.out.printf("%.2f , 1/j");
        }else{
            while(i<pangkat){
                j=j*angka;
                i++;
            }
            System.out.println(j);
        }
    }
}