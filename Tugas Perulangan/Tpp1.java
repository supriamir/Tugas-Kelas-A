import java.util.Scanner;
class Tpp3{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("base ");
        int n = sc.nextInt();
        System.out.print("pangkat ");
        int m = sc.nextInt();
        int o = 1;
        for (int i = 0; i<m; i++){
            o = o*n;            

        } 
        System.out.println(o);


    }
}