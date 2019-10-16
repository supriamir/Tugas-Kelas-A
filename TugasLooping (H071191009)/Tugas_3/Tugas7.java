import java.util.*;
class Tugas7{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        int rank1 = 0;
        int rank2 = 0;
        int rank3 = 0;
        String nama1 = null;
        String nama2 = null;
        String nama3 = null;
        for (int i = 0; i < N; i++){
            String nama = n.next();
            int nilai = n.nextInt();
            if (nilai > rank3){
                rank3 = nilai;
                nama3 = nama;
                if (nilai > rank2){
                    rank3 = rank2;
                    nama3 = nama2;
                    rank2 = nilai;
                    nama2 = nama;
                    if(nilai > rank1){
                        rank2 = rank1;
                        nama2 = nama1;
                        rank1 = nilai;
                        nama1 = nama;
                    }
                }
            }
        }
        System.out.println();
        System.out.println(rank1 + rank2 + rank3);
        System.out.println(nama1);
        System.out.println(nama2);
        System.out.println(nama3);
    }
}