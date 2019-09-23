import java.util.Scanner;
class Tugasloop7{
    public static void main(String[] args) {
         Scanner san=new Scanner(System.in);
         double i,x,y;
         //menu range dari x
         System.out.printf("Pilih range dari X\n1. 0 - 50 dengan increment 5\n2. 1 - 10 dengan increment 1\n3. 1 - 5 dengan increment 0,5\nMenu = ");
         
         int rangeX=san.nextInt();
         //jika memiilih menu 1
         if(rangeX==1){
             System.out.printf("----RANGE X DARI 0 - 50----\nBatas x = ");
             x=san.nextDouble();
             //batas angka 
             if(x>=0&&x<=50){
                //pengulangan untuk mencari y
                for(i=0;i<=x;i+=5){
                    y=4*i+1;
                    System.out.printf("x = %.0f y = %.0f\n",i,y);
                }
             }else{
                System.out.println("input invalid");
             }
         }else if(rangeX==2){//bila memilih menu 2
            System.out.printf("----RANGE x DARI 1 - 10----\nBatas x = ");
            x=san.nextDouble();
            if(x>=1&&x<=10){//batas nilai x
                for(i=0;i<=x;i+=1){//pengulangan untuk mencari y
                    y=Math.sqrt(i)-1;
                    System.out.printf("x = %.0f y = %.1f\n",i,y);
                }
            }else{
                System.out.println("input invalid");
            }
        }else if(rangeX==3){//bila memilih menu 3
            System.out.printf("----RANGE X DARI 1 - 5----\nBatas x = ");
            x=san.nextDouble();
            if(x>=1&&x<=5){//batas nilai x
                for(i=0;i<=x;i+=0.5){//pengulangan untuk mencari y
                    y=5*Math.pow(i, 2)+3*i-2;
                    System.out.printf("x = %.1f y = %.1f\n",i,y);
                }
            }else{
                System.out.println("input invalid");
            }
        }
        else{
            System.out.println("input invalid");
        }
    }
    
}