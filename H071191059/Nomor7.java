import java.util.Scanner;
class Nomor7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n = jumlah pemain
        String name[] = new String[n]; 
        int score[] = new int [n];
        int rank1 = 0;
        int rank2 = 0;
        int rank3 = 0;
        String name1 = null;
        String name2 = null;
        String name3 = null;

        if (n < 3) {
            System.out.println("Inputan Anda Tidak Valid");
        }
        System.out.println("Input nama = ");
        for (int i = 0 ; i < n ; i++) {
            name[i] = sc.nextLine();
        }
        System.out.println();

        for (int i = 0 ; i < n ; i++) {
            System.out.print("Input skor " + (i + 1) + " = ");
            score[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n ; i++) {
            if (score[i] > rank3) {
                rank3 = score[i];
                name3 = name[i];
                if (score[i] > rank2) {
                    rank3 = rank2;
                    name3 = name2;
                    rank2 = score[i];
                    name2 = name[i];
                    if (score[i] > rank1) {
                        rank2 = rank1;
                        name2 = name1;
                        rank1 = score[i];
                        name1 = name[i];        
                    }
                } 
            }
        }
        System.out.println();
        System.out.println(rank1 + rank2 + rank3);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        sc.close();
    }
}