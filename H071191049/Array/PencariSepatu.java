import java.util.Scanner;
class PencariSepatu{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        System.out.print("Jumlah Sepatu = ");
        int jumlahSepatu = san.nextInt();
        int ukuran [] = new int [jumlahSepatu];
        String warna [] = new String [jumlahSepatu];
        Boolean adaYangCocok = false;
        for(int i=0;i<jumlahSepatu;i++){
            System.out.println();
            System.out.println("Sepatu ke-"+(i+1));
            System.out.print("Ukuran = ");
            ukuran[i]=san.nextInt();
            System.out.print("Warna = ");
            warna[i]=san.next();
        }
        System.out.println();
        System.out.println("Ukuran Sepatu untuk Winda");
        int ukuranWinda = san.nextInt();
        System.out.println("Warna Sepatu untuk Winda");
        String warnaWinda = san.next();
        System.out.println("\n*--Sepatu Yang Cocok--*");
        for(int i=0;i<jumlahSepatu;i++){
            if(ukuranWinda==ukuran[i] && warnaWinda.equalsIgnoreCase(warna[i])){
                System.out.println("Sepatu ke-"+(i+1));
                adaYangCocok = true;
            }
        }
        if(adaYangCocok==false){
            System.out.println("Tidak Ditemukan");
        }
    }
}