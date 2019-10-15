import java.util.Scanner;
class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int h[] = new int[n];
        String colour[] = new String [n];
        boolean found = false;
        
        for (int i = 0; i < n; i++) {
            h[i] = input.nextInt();
            colour[i] = input.next();
        }

        int x = input.nextInt();
        String colourx = input.next();

        for (int i = 0; i < n; i++) {
            if (h[i] == x && colour[i].equalsIgnoreCase(colourx)) {
                found = true;
                System.out.println("Sepatu berwarna "+ colour[i] + " berukuran " + h[i] +"ditemukan pada indeks ke " +i);
            }
            found = false;
        }
        input.close();
    }
}