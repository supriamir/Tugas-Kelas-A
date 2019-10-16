import java.util.Scanner;
class Nilaidibawahstandar{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        int n = san.nextInt();
        int sumGagal[]=new int [n];
        for(int i=0;i<n;i++){
            int sumNilai=0;
            int murid = san.nextInt();
            int nilai [] = new int [murid];
            for(int j=0;j<nilai.length;j++){
                nilai [j]=san.nextInt();
                sumNilai+=nilai[j];
            }
            int rataRata = sumNilai/murid;
            for(int k=0;k<nilai.length;k++){
                if(rataRata>nilai[k]){
                    sumGagal[i]++;
                }
            }
        }
        for(int i=0;i<sumGagal.length;i++){
            System.out.println(sumGagal[i]);
        }
    }
}