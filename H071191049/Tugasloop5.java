import java.util.Scanner;
class Tugasloop5{
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.print("base = ");
        int base = key.nextInt();//inputan angka yg mau dipangkatkan
        System.out.print("pangkat = ");
        int pangkat = key.nextInt();//inputan pangkat
        long hasil=1;
        int negatif=0;//pembanding bila pangkatnya negatif

        //jika pangkatnya negatif kode ini dijalankan
        if(pangkat<0){
            pangkat=-pangkat;
            negatif=1;
        }
        //jika pangkat dan angkanya nol kode ini dijalankan
        if(pangkat==0 && base==0){
            hasil=0;
        }
        //pengulangan sebagai pemangkatan
        for (int i = 0;i<pangkat;i++){
            hasil*=base;
        }
        //jika pangkatnya negatif maka sysoutnya seperti ini
        if(negatif==1){
            System.out.printf("%d^-%d = 1/%d (%f)",base,pangkat,hasil,1/(Double.valueOf(hasil)));
        }
        //jika pangkatnya positif atau nol maka sysoutnya seperti ini 
        else if(negatif==0){
            System.out.printf("%d^%d = %d",base,pangkat,hasil);
        }
    }
}