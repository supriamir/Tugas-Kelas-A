import java.util.Scanner;
class tugas4{
    public static void main(String[] args) {
    Scanner yuk = new Scanner(System.in);
    int n = yuk.nextInt();
    int odd,even,pos,neg; //odd = Ganjil ; even = Genap ; pos = Positif ; neg = Negatif;
    odd = 0;
    even = 0;
    pos = 0;
    neg = 0;
    System.out.println("Nilai n ="+ n);

    for (int i = 0; i < 5; i++){
        if (n % 2 == 0 && n > 0){
            even++;
            pos++;
    }else if (n % 2 == 0 && n < 0){
        neg++;
        even++;
    }else if (n % 2 != 0 && n > 0){
        odd++;
        pos++;
    }else if (n % 2 != 0 && n < 0){
        odd++;
        neg++;
    }else{
        even++;
    }
    System.out.println("Bilangan Genap ="+ even);
    System.out.println("Bilangan Ganjil ="+ odd);
    System.out.println("Bilangan Positif ="+ pos);
    System.out.println("Bilangan Negatif ="+ neg);
    }
}
}