package Day68;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan ukuran persegi :");
        int ukuran = input.nextInt();
        
        for (int i = 1; i <=ukuran; i++){
            for(int j = 1; j <=ukuran; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
