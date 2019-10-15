import java.util.Scanner;

class Tugas1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for(int i = 0 ; i < n ; i++){
         for(int j = 0 ; j <= i ; j++){
          arr[i][j] = sc.nextInt(); 
            }
        }

        int maindex = 0;
        int leftdex = 0;
        int rightdex = 0;
        int leftsum = arr[maindex][leftdex] + arr[maindex+1][leftdex];
        int rightsum= arr[maindex][rightdex] + arr[maindex+1][rightdex+1];
        rightdex = 1;

        for(maindex = maindex + 1 ; maindex < n - 1 ; maindex++){

            if(leftsum + arr[maindex+1][leftdex] >= leftsum + arr[maindex+1][leftdex+1]){
                leftsum += arr[maindex+1][leftdex];
                leftdex = leftdex;
            }
            else{
                leftsum += arr[maindex+1][leftdex+1];
                leftdex = leftdex + 1;
            }
            if(rightsum + arr[maindex+1][rightdex] >= rightsum + arr[maindex+1][rightdex+1]){
                rightsum += arr[maindex+1][rightdex];
                rightdex = rightdex;
            }
            else{
                rightsum += arr[maindex+1][rightdex+1];
                rightdex = rightdex + 1;
            }
         }

         if(rightsum > leftsum){
            System.out.println(rightsum);
        }
        else{
            System.out.println(leftsum);
        }
    }
}