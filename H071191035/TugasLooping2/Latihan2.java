import java.util.Scanner;

class Latihan2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int pass = 2002;
        boolean answer = false;
        System.out.print("Password please : ");
        while (!answer) {
            int seek = key.nextInt(); // user memasukkan password 
            answer = seek == pass;
            System.out.println("Wrong code...who are you? >:(");// dicetak jika password salah
        } 
        System.out.print("~~~~~~~~~\nPassword correct :)"); // password benar
    }
}