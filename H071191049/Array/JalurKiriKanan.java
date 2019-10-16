import java.util.Scanner;
class JalurKiriKanan{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        int n = san.nextInt();
        int nilai [][] = new int [n][n];
        int simpanKiri [] = new int [n];
        int simpanKanan [] = new int [n];
        int totalKiri = 0;
        int totalKanan = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                nilai [i][j]=san.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int garisTengah=i/2;
            for(int j=0;j<=garisTengah;j++){           
                for(int k=0;k<=j;k++){
                    if(nilai[i][j]<nilai[i][k]||nilai[i][j]<simpanKiri[i]){
                        break;
                    }
                    simpanKiri [i]=nilai[i][j];
                }
            }
            if(i==1){
                garisTengah=1;
            }
            for(int j=garisTengah;j<=i;j++){                
                for(int k=j;k<=i;k++){
                    if(nilai[i][j]<nilai[i][k]||nilai[i][j]<simpanKanan[i]){
                        break;
                    }
                    simpanKanan [i]=nilai[i][j];
                }
            }
        }
        for(int i=0;i<n;i++){
        totalKiri += simpanKiri [i]; 
        totalKanan += simpanKanan [i]; 
        }
        System.out.println("Jalur Nilai Max");
        if(totalKiri>totalKanan){
            for(int i=0;i<n;i++){
                System.out.println(simpanKiri[i]);
            }
            System.out.println(totalKiri);
        }
        else{
            for(int i=0;i<n;i++){
                System.out.println(simpanKanan[i]);
            }
            System.out.println(totalKanan);
        }
    }
}