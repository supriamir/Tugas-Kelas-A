import java.util.Scanner;

class Looping3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pilih fungsi : "); 
        int function = input.nextInt();

        if (function==1) {
            System.out.println("\n1. 0-50 dengan kenaikan 5\n2. 1-10 dengan kenaikan 1\n3. 1-5 dengan kenaikan 0.5");
            System.out.print("Pilih range x : ");
            int range = input.nextInt();
            if (range==1) {
                int x = 0;
                while (x<=50) {
                    int y = 4*x+1;
                    System.out.println(" ");
                    System.out.println("Untuk x = " + x);
                    System.out.println("Nilai fungsi y = " + y);
                    x = x+5;
                    }
            } else if (range==2) {
                int x = 1;
                while (x<=10) {
                    int y = 4*x+1;
                    System.out.println(" ");
                    System.out.println("Untuk x = " + x);
                    System.out.println("Nilai fungsi y = " + y);
                    x++;
                }
            } else {
                double x = 0;
                while (x<=5) {
                    double y = 4*x+1;
                    System.out.println(" ");
                    System.out.println("Untuk x = " + x);
                    System.out.println("Nilai fungsi y = " + y);
                    x = x + 0.5;
                }
            }
        } else if (function==2) {
            System.out.println("\n1. 0-50 dengan kenaikan 5\n2. 1-10 dengan kenaikan 1\n3. 1-5 dengan kenaikan 0.5");
            System.out.print("Pilih range x : ");
            int range = input.nextInt();
            if (range==1) {
                int x = 0;
                while (x<=50) {
                    double y = Math.sqrt(x)-1; 
                    System.out.println(" ");
                    System.out.println("Untuk x = " + x);
                    System.out.println("Nilai fungsi y = " + y);
                    x = x + 5;
                    }
                } else if (range==2) {
                int x = 1;
                while (x<=10) {
                    double y = Math.sqrt(x)-1;
                    System.out.println(" ");
                    System.out.println("Untuk x = " + x);
                    System.out.println("Nilai fungsi y = " + y);
                    x++;
                }
            } else {
                double x = 0;
                while (x<=5) {
                    double y = Math.sqrt(x)-1;
                    System.out.println(" ");
                    System.out.println("Untuk x = " + x);
                    System.out.println("Nilai fungsi y = " + y);
                    x = x + 0.5;
                    }
                }
      } else {
            System.out.println("\n1. 0-50 dengan kenaikan 5\n2. 1-10 dengan kenaikan 1\n3. 1-5 dengan kenaikan 0.5");
            System.out.print("Pilih range x : ");
            int range = input.nextInt();
            if (range==1) {
                int x = 0;
                while (x<=50) {
                    double y = (5*Math.pow(x, 2))+(3*x)-2;
                    System.out.println(" ");
                    System.out.println("Untuk x = " + x);
                    System.out.println("Nilai fungsi y = " + y);
                    x = x + 5;
                    }
                } else if (range==2) {
                int x = 1;
                while (x<=10) {
                    double y = (5*Math.pow(x, 2))+(3*x)-2;
                    System.out.println(" ");
                    System.out.println("Untuk x = " + x);
                    System.out.println("Nilai fungsi y = " + y);
                    x++;
                }
            } else {
                double x = 0;
                while (x<=5) {
                    double y = (5*Math.pow(x, 2))+(3*x)-2;
                    System.out.println(" ");
                    System.out.println("Untuk x = " + x);
                    System.out.println("Nilai fungsi y = " + y);
                    x = x + 0.5;
                }
            }
        }
        input.close();
    }
}
