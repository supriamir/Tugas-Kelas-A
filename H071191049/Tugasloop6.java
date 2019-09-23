import java.util.Scanner;
class Tugasloop6{
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        //passsword default adalah 2002
        int myPassword=2002;
        //ketika keadaan true maka statement ini akan terus berjalan        
        while(true){
            System.out.println("MASUKKAN PASSWORD ANDA");
            int Password=key.nextInt();
            //jika Password yg di input sama dengan Password default maka statement ini dijalankan
            if(Password==myPassword){
                System.out.println("Password anda benar");
                break;//untuk mengakhiri perulangan 
            }
            System.out.println("Password anda salah");
        }
    }
}
