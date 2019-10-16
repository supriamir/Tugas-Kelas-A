import java.util.Scanner;
class Tiganilaitertinggi{
    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        int n = san.nextInt();
        String nama [] = new String [n];
        int score [] = new int [n];
        int simpanScore [] = {0,0,0};
        String simpanNama [] = {null,null,null};

        //input
        for(int i=0;i<nama.length;i++){
           nama [i] = san.next();
           score [i] = san.nextInt();
           if(score[i]>=100){
               System.out.println("input score <100");
               return;
           }
        }
        //disini saya mengisi simpanScore 0-2 dengan score 0-2
        for(int j=0;j<3;j++){
            simpanScore[j]=score[j];
            simpanNama[j]=nama[j];
        }
        //disini melakukan penyeleksian kondisi skor yang cocok
        for(int i=3;i<nama.length;i++){
            if(score[i]>=simpanScore[0]&&simpanScore[0]<=simpanScore[1]&&simpanScore[0]<=simpanScore[2]){
                simpanScore[0]=simpanScore[1];
                simpanNama[0]=simpanNama[1];
                simpanScore[1]=simpanScore[2];
                simpanNama[1]=simpanNama[2];
                simpanScore[2]=score[i];
                simpanNama[2]=nama[i];
            }
            else if(score[i]>=simpanScore[1]&&simpanScore[1]<=simpanScore[0]&&simpanScore[1]<=simpanScore[2]){
                simpanScore[1]=simpanScore[2];
                simpanNama[1]=simpanNama[2];
                simpanScore[2]=score[i];
                simpanNama[2]=nama[i];
            }
            else if(score[i]>=simpanScore[2]&&simpanScore[2]<=simpanScore[1]&&simpanScore[2]<=simpanScore[0]){
                simpanScore[2]=score[i];
                simpanNama[2]=nama[i];
            }
        }
        san.close();
        System.out.println(simpanScore[0]+simpanScore[1]+simpanScore[2]);
        for(int j=0;j<3;j++){
        System.out.println(simpanNama[j]);
        }
    }

}