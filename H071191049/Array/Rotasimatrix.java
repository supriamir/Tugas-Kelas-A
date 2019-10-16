import java.util.Scanner;
class Rotasimatrix{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        int n = san.nextInt();
        int m = san.nextInt();
        int arr [][] = new int [n][m];
        int simpan [][] = new int [n][m];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr [i][j]= san.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                simpan [i][j]= arr[j][i];
            }  
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=(arr.length-1);j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}