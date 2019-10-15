import java.util.Scanner;
class Tugas06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maindex = 0;
        int dexkiri = 0;
        int dexkanan = 0;
        int sumkiri = arr[maindex][dexkiri] + arr[maindex+1][dexkiri];
        int sumkanan = arr[maindex][dexkanan] + arr[maindex+1][dexkanan+1];
        dexkanan = 1;

        for (maindex = maindex + 1 ; maindex < n-1; maindex++) {
            if(sumkiri + arr[maindex+1][dexkiri] >= sumkiri + arr[maindex+1][dexkiri+1]) {
                sumkiri += arr[maindex+1][dexkiri];
                dexkiri = dexkiri;
            }else{
                sumkiri += arr[maindex+1][dexkiri+1];
                dexkiri = dexkiri + 1;
            }

            if(sumkanan + arr[maindex+1][dexkanan] >= sumkanan + arr[maindex+1][dexkanan+1]){
                sumkanan += arr[maindex+1][dexkanan];
                dexkanan = dexkanan;
            }else {
                sumkanan += arr[maindex+1][dexkanan+1];
                dexkanan = dexkanan + 1;
            }
        }

        if(sumkanan > sumkiri){
            System.out.println("\n" + sumkanan);
        }else{
            System.out.println("\n" + sumkiri);
        }
    }
}