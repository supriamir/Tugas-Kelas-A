import java.util.Scanner;
class Tugas07{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rank1 = 0;
        int rank2 = 0;
        int rank3 = 0;
        String nama1 = null;
        String nama2 = null;
        String nama3 = null;

        for (int i = 0; i < n; i++){
            String nama = sc.next();
            int score = sc.nextInt();
            if (score > rank3){
                rank3 = score;
                nama3 = nama;
                if (score > rank2){
                    rank3 = rank2;
                    nama3 = nama2;
                    rank2 = score;
                    nama2 = nama;
                    if (score > rank1){
                        rank2 = rank1;
                        nama2 = nama1;
                        rank1 = score;
                        nama1 = nama;
                    }
                }
            }
        }
        System.out.println();
        System.out.println(rank1 + rank2 + rank3);
        System.out.println(nama1 + " " + rank1);
        System.out.println(nama2 + " " + rank2);
        System.out.println(nama3 + " " + rank3);
    }
}