import java.util.Scanner;

public class LoopingSatu{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int base = userInput.nextInt();
        int pangkat = userInput.nextInt();
        userInput.close();
        double jumlah = 1;
        if (pangkat>=0){
            for (int a=1 ; a<=pangkat ; a++){
                jumlah = jumlah*base;
            }
            System.out.printf("%d^%d = %.0f",base,pangkat,jumlah);
        }else if(pangkat<0){
            for (int a=-1 ; a>=pangkat ; a--){
                jumlah = jumlah*base;
            }
            System.out.println(base + "^" + pangkat + " = " + (1/jumlah));
        }
    }
}
