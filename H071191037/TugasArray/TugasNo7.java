import java.util.Scanner;

class TugasNo7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        String name[] = new String[n];
        int score[] = new int[n];
        int rank1 = 0, rank2 = 0, rank3 = 0;
        String name1 = null, name2 = null, name3 = null;
        
        System.out.println("Input name..");
        for (int i = 0; i < n; i++) {
            name[i] = inp.nextLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Input score " + (i+1) + " : ");
            score[i] = inp.nextInt();
        }
        inp.close();

        for(int i = 0; i < n; i++) {
        if(score[i] > rank3) {
            rank3 = score[i];
            name3 = name[i];
            if(score[i] > rank2) {
                rank3 = rank2;
                name3 = name2;
                rank2 = score[i];
                name2 = name[i];
                    if(score[i] > rank1) {
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
        System.out.println(name1 + " " + rank1);
        System.out.println(name2 + " " + rank2);
        System.out.println(name3 + " " + rank3);
    }
}