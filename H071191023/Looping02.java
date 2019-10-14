import java.util.Scanner;
class Looping02{
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int N = in.nextInt();
    int sum = 0;
    for (int i=1; i<=N;i++){
        if (N%i==0){
            sum+=i;
    }
    }
    System.out.println("sum="+sum);
    } 
    }   

